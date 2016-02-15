#Toiletten In Köln

Diese Webapplikation zeigt die öffentlich zugänglichen Toiletten. Sie unterscheidet sich von der Webseite 
[Schnell Toilette in Köln finden](http://www.toiletten.koeln/toilette-finden.html) in der Form, dass sie direkt die Toiletten in der Umgebung anzeigt.

## Datenstruktur

Beispiel:

        "uid": "1005483",
        "type": "HappyToilet Köln",
        "name": "Biergarten Rathenauplatz",
        "street": "Rathenauplatz",
        "area": "Neustadt-Süd",
        "zipcode": "50674",
        "city": "Köln",
        "coordinates": "50.931407,6.935809",
        "phone": "Startdaten",
        "cardname": "Biergarten Rathenauplatz",
        "cardnamegb": "Biergarten Rathenauplatz",
        "district": "Ehrenfeld",
        "description": "Nutzungsbebühr: Kostenlos;Ein Trinkgeld ist freiwillig.; ",
        "descriptiongb": "Usage Fee: free of charge; Tips are voluntary.; ",
        "opening": "Geöffnet in der Sommersaison von April bis September bei schönem Wetter.",
        "openinggb": "Opened during summer season from April to September when the weather is nice.",
        "start": "2015-04-01",
        "stop": "2015-09-30",
        "infrastructure": "3,4,7,11"

### infrastructure

Das Feld infrastructure bietet Zugriff auf die Infrastruktur an engegebenem Ort. Dabei gelten folgende Mappings:

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
