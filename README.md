## Productvisie

### Web-app Tippy-Toe Cinemas

De Tippy-Toe Cinemas website brengt alle informatie over filmvoorstellingen, bioscooplocaties, beschikbare zitplaatsen en ticketprijzen voor de Typpy-Toe cinemas samen op één centrale plek.

**Voor wie is dit platform bedoeld?**

De website richt zich op een breed publiek van filmliefhebbers, waaronder:
- Studenten die op zoek zijn naar betaalbare filmvoorstellingen
- Gezinnen die samen een film willen kijken
- Groepen vrienden die samen naar de bioscoop willen
- Casual bezoekers die een film willen kijken


### User Story Mapping

#### Bioscoop verkennen
**Als bezoeker wil ik:**
- een overzicht zien van alle Tippy-Toe bioscoop locaties
- kunnen zien welke vestigingen open of gesloten zijn
- details kunnen bekijken van een specifieke vestiging (openingsuren, locatie, ...)

#### Films ontdekken
**Als bezoeker wil ik:**
-  een overzicht zien van alle beschikbare films
-  kunnen zoeken op filmtitel
-  films kunnen filteren op genre
-  een trailer kunnen bekijken
-  kunnen zien in welke zaal een film draait
-  kunnen zien hoeveel vrije zetels er zijn
-  een ticket / zitplaats kunnen reserveren

#### Tarieven bekijken
**Als bezoeker wil ik:**
-  een overzicht zien van alle ticketprijzen
-  kunnen zien welke kortingen beschikbaar zijn
-  informatie zien over studentenkorting
-  informatie zien over familie- en groepskortingen
-  informatie zien over abonnementen

#### Tickets reserveren
**Als bezoeker wil ik:**
-  een film kunnen selecteren
-  een datum en tijdstip kunnen kiezen
-  het aantal tickets kunnen opgeven
-  de totaalprijs kunnen zien inclusief eventuele kortingen
-  mijn reservering kunnen bevestigen
-  een bevestiging printen van mijn reservering
  

---

### Personas (gebruikersprofielen)

#### Persona 1: Student Tom (20 jaar)

**Achtergrond:**  
Tom is een communicatiewetenschappen student aan de Universiteit Antwerpen. Hij woont in een studentenkot in het centrum en gaat graag spontaan met vrienden naar de film, vooral in het weekend of na examens.

**Doelen:**
- Goedkope tickets vinden met studentenkorting
- Last-minute kunnen beslissen om naar de film te gaan
- Snel kunnen zien waar nog vrije plaatsen zijn
- Makkelijk kunnen betalen via smartphone

**Behoeften:**
- Duidelijk overzicht van studentenkorting en speciale acties
- Mobiele interface die snel en responsief is
- Overzichtelijke weergave van beschikbare tijdstippen
- Mogelijkheid om met vrienden gezamenlijk te reserveren

**Pijnpunten:**
- Lange wachtrijen aan de kassa vermijden
- Onduidelijke informatie over prijzen en kortingen
- Te ingewikkelde reserveringssystemen
- Websites die niet goed werken op mobiel

**Technologisch niveau:** Gevorderd; gebruikt dagelijks smartphone en laptop voor school en entertainment.

#### Persona 2: Gezinsouder Sara (38 jaar)

**Achtergrond:**  
Sara is getrouwd en heeft twee kinderen van 7 en 10 jaar. Ze werkt parttime als administratief medewerker en organiseert graag gezinsuitjes in het weekend. Ze woont in Leuven en bezoekt regelmatig de lokale bioscoop.

**Doelen:**
- Een geschikte kindvriendelijke film vinden voor het hele gezin
- Tijdstippen kiezen die passen in het gezinsschema
- Kosten onder controle houden met familie- of groepskortingen
- Zekerheid hebben dat er voldoende plaatsen zijn voor het hele gezin

**Behoeften:**
- Informatie over leeftijdsgrenzen en filminhoud
- Duidelijke prijsinformatie inclusief familietickets
- Mogelijkheid om plaatsen naast elkaar te reserveren
- Overzicht van beschikbaarheid voordat ze naar de bioscoop gaat

**Pijnpunten:**
- Onoverzichtelijke websites met verborgen kosten
- Geen duidelijkheid over beschikbaarheid van zitplaatsen
- Gebrek aan informatie over kindvriendelijkheid van films
- Ingewikkelde reserveringsprocedures

**Technologisch niveau:** Gemiddeld; gebruikt tablet en smartphone voor praktische zaken, maar geen fan van complexe interfaces.

#### Persona 3: Filmfan Pieter (28 jaar)

**Achtergrond:**  
Pieter werkt als grafisch ontwerper in Brussel en is een echte cinefiel. Hij volgt nieuwe releases op de voet, bezoekt premières en kijkt graag films in optimale omstandigheden (3D, VIP-zetels). Hij gaat gemiddeld twee keer per maand naar de bioscoop.

**Doelen:**
- Nieuwe films ontdekken zodra ze uitkomen
- Trailers en uitgebreide informatie bekijken
- De beste kijkervaring selecteren (3D, VIP, beste tijdstip)
- Films volgen op basis van favoriete genres en regisseurs

**Behoeften:**
- Gedetailleerde filminformatie (cast, synopsis, regisseur, duur)
- Duidelijk overzicht van speciale voorstellingen (3D, IMAX-equivalent)
- Mogelijkheid om VIP-zetels te reserveren
- Trailers kunnen bekijken voor besluitvorming

**Pijnpunten:**
- Verouderde of incomplete filminformatie
- Geen duidelijkheid over welke films waar en wanneer draaien
- Gebrek aan onderscheid tussen reguliere en premium voorstellingen
- Beperkte informatie over technische specificaties (geluid, beeld)

**Technologisch niveau:** Expert; vroege adopter van nieuwe technologieën, gebruikt meerdere devices en apps dagelijks.

---

## Conceptueel Model

### Belangrijkste Concepten

#### Gebruiker
Een persoon die het Tippy-Toe Cinemas platform bezoekt en gebruikt. Gebruikers kunnen anoniem browsen of een account aanmaken voor reserveringen.

**Eigenschappen:**
- Unieke identificatie / persoonlijke accounts
- Contactgegevens (Naam, email, etc. )
- Gebruikerstype (standaard, student, abbonementshouder)
- Overzicht actieve en vorige reserveringen

#### Bioscoop
Een fysieke vestiging van Tippy-Toe Cinemas waar films worden vertoond.
**Eigenschappen:**
- Naam (bijv. "Tippy-Toe Antwerpen", "Tippy-Toe Brugge")
- Adres en locatiegegevens
- Status (open/gesloten)
- Openingstijden
- Faciliteiten

#### Zaal
**Eigenschappen:**
- Naam of nummer (bijv. "Zaal A")
- Capaciteit (aantal zitplaatsen)
- Type faciliteiten (VIP-zetels, IMAX, etc.)

#### Films
**Eigenschappen:**
- Titel
- Beschrijving
- Genres
- Duur
- Poster-afbeelding
- Trailer-link
- Release-datum of jaar
- Cast en crew (optioneel)

#### Voorstellingen
Een specifieke vertoning van een film op een bepaalde datum, tijd en locatie.
**Eigenschappen:**
- Verwijzing naar de film
- Verwijzing naar de zaal
- Datum en starttijd
- Eindtijd
- Aantal beschikbare zitplaatsen
- Type voorstelling (2D, 3D, VIP)
- Speel locaties (Antwerpen, Brugge, etc.)

#### Ticket/Reservatie
Een boeking gemaakt door een gebruiker voor een specifieke voorstelling.
**Eigenschappen:**
- Unieke identificatie
- Verwijzing naar de gebruiker
- Verwijzing naar de voorstelling
- Aantal tickets
- Geselecteerde stoelnummers (optioneel)
- Tickettype (standaard, student, abbonement)
- Totaalprijs
- Reserveringsdatum
- Geldigheidsdatum

### Relaties tussen Concepten

#### Bioscoop – Zaal
- Een bioscoop heeft één of meerdere zalen
- Een zaal behoort tot precies één bioscoop
- **Relatie:** 1:N (één-op-veel)

#### Film – Voorstelling
- Een film kan meerdere voorstellingen hebben (verschillende tijden, datums, locaties)
- Een voorstelling vertoont precies één film
- **Relatie:** 1:N (één-op-veel)

#### Zaal – Voorstelling
- Een zaal kan meerdere voorstellingen hosten (op verschillende tijdstippen)
- Een voorstelling vindt plaats in precies één zaal
- **Relatie:** 1:N (één-op-veel)

#### Gebruiker – Reservatie
- Een gebruiker kan meerdere reserveringen maken
- Een reservering wordt gemaakt door precies één gebruiker
- **Relatie:** 1:N (één-op-veel)

#### Voorstelling – Reservatie
- Een voorstelling kan meerdere reserveringen hebben (verschillende bezoekers)
- Een reservering is voor precies één voorstelling
- **Relatie:** 1:N (één-op-veel)

---

## Functionele Analyse

### Wireframes


#### Wireframe 1: Startpagina

![wireframe startpagina](https://i.imgur.com/AMwlwCx.png)

#### Wireframe 2: Filmspagina

![wireframe filmspagina](https://i.imgur.com/Icbww33.png)

#### Wireframe 3: Tarievenpagina

![wireframe tarievenpagina](https://i.imgur.com/PcxfYKK.png)

## Conceptueel model

**Gebruiker -> Reservatie -> Voorstelling -> (Film, Zaal) -> Bioscoop**

- De gebruiker maakt een reservatie.
- Een reservatie hoort bij een bepaalde voorstelling.
- Een voorstelling koppelt een film aan een zaal, op een specifieke datum en tijd.
- De zaal behoort tot één bioscoop.

####  Tekstuele visualisatie

`Bioscoop (1) — (0..*) Zaal`
`Zaal (1) — (0..*) Voorstelling`
`Film (1) — (0..*) Voorstelling`
`Gebruiker (1) — (0..*) Reservatie`
`Voorstelling (1) — (0..*) Reservatie`

#### Visuele weergave

Gebruiker 1 ---- * Reservatie * ---- 1 Voorstelling * ---- 1 Film
                                 |
                                 * ---- 1 Zaal * ---- 1 Bioscoop
