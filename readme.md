#Toiletten In Köln

Diese Webapplikation zeigt die öffentlich zugänglichen Toiletten. Sie basiert auf den durch das Portal [Offene Daten Köln](http://offenedaten-koeln.de/) zur Verfügung gestellten Daten [Oeffentliche Toiletten Koeln](http://offenedaten-koeln.de/dataset/oeffentliche-toiletten-koeln). Sie unterscheidet sich von der Webseite [Schnell Toilette in Köln finden](http://www.toiletten.koeln/toilette-finden.html) in der Form, dass sie direkt die Toiletten in der Umgebung anzeigt.

## Schnittstellen

Es stehen zwei Schnittstellen zur Verfügung

### /toiletteninkoeln/service/awb/json

Hier wird die XML-Struktur in eine JSON-Struktur umgewandelt. 

### /toiletteninkoeln/service/awb/geojson

Hier wird die XML-Struktur in [GeoJson](http://geojson.org/) umgewandelt.

## Datenstruktur

Das folgende Beispiel zeigt die Datenstruktur, die von der Schnittstelle geliefert wird, anhand eines Datensatzes: 
```
<address>
  <uid>1005483</uid>
  <type><![CDATA[HappyToilet Köln]]></type>
  <name><![CDATA[Biergarten Rathenauplatz]]></name>
  <street><![CDATA[Rathenauplatz]]></street>
  <area>Neustadt-Süd</area>
  <zipcode>50674</zipcode>
  <city>Köln</city>
  <coordinates>50.931407,6.935809</coordinates>
  <phone>Startdaten</phone>
  <cardname><![CDATA[Biergarten Rathenauplatz]]></cardname>
  <cardnamegb><![CDATA[Biergarten Rathenauplatz]]></cardnamegb>
  <district>Ehrenfeld</district>
  <description><![CDATA[Nutzungsbebühr: Kostenlos;Ein Trinkgeld ist freiwillig.; ]]></description>
  <descriptiongb><![CDATA[Usage Fee: free of charge; Tips are voluntary.; ]]></descriptiongb>
  <opening><![CDATA[Geöffnet in der Sommersaison von April bis September bei schönem Wetter.]]></opening>
  <openinggb><![CDATA[Opened during summer season from April to September when the weather is nice.]]></openinggb>
  <start>2015-04-01</start>
  <stop>2015-09-30</stop>
  <image></image>
  <infrastructure>3,4,7,11</infrastructure>
 </address>
```
Diese Datenstruktur wird ein eine JSON-Repräsentation umgewandet:
```
{
  "uid":1005483,
  "type":"HappyToilet Köln",
  "name":"Biergarten Rathenauplatz",
  "street":"Rathenauplatz",
  "area":"Neustadt-Süd",
  "zipcode":50674,
  "city":"Köln",
  "lat":50.931407,
  "lng":6.935809,
  "phone":"Startdaten",
  "cardname":"Biergarten Rathenauplatz",
  "cardnamegb":"Biergarten Rathenauplatz",
  "district":"Ehrenfeld",
  "description":"Nutzungsbebühr: Kostenlos;Ein Trinkgeld ist freiwillig.; ",
  "descriptiongb":"Usage Fee: free of charge; Tips are voluntary.; ",
  "opening":"Geöffnet in der Sommersaison von April bis September bei schönem Wetter.",
  "openinggb":"Opened during summer season from April to September when the weather is nice.",
  "start":"2015-04-01",
  "stop":"2015-09-30",
  "infrastructureMap":{"11":"Kostenlos","3":"Baby-Wickeltisch","4":"Urinal","7":"HappyToilet Köln"}
}
```

### infrastructure

Das Feld infrastructure ist insofern besonders, weil es zunächst nur Zahlen beinhaltet. Diesen stehen Eigenschaften gegenüber, die durch die Implementierung in die infrastructureMap aufgelöst wird. Dabei gelten folgende Mappings:

- 1: Barrierefrei (z.T. eingeschränkt)
- 2: 24h geöffnet
- 3: Baby-Wickeltisch
- 4: Urinal
- 5: City-Toilette
- 6: Toilette in öffentlichen Einrichtungen
- 7: HappyToilet Köln
- 8: Toilette in Grünanlagen
- 9: Kostenpflichtig
- 10: Euro WC-Schlüssel
- 11: Kostenlos

## Installation

Der Service wurd in JAVA implementiert und kann als web-Applikation z.B. mit einem Tomcat ausgeführt werden. Voraussetzung ist JAVA 7. Mit folgenden zwei Befehlen, läßt sich der Service auschecken und installieren:

    git clone https://github.com/weberius/toiletteninkoeln.git
    maven clean install

## Oberfläche

Nach Installation der Web-Applikation steht eine einfache Web-Oberfläche zur Verfügung. Sie läßt sich z.B. über [http://localhost:8080/toiletteninkoeln](http://localhost:8080/toiletteninkoeln) aufrufen.
