# Water Reminder

Een eenvoudige Android-app die WorkManager gebruikt om elk uur een pushmelding te versturen als herinnering om water te drinken.

## Functionaliteit
- Aanvragen van runtime-machtiging voor meldingen op Android 13+.
- Inplannen van een terugkerende achtergrondtaak die elk uur een melding toont.
- Herstellen van de planning na het opnieuw opstarten van het toestel.

## Vereisten
- Android Studio Iguana of nieuwer.
- Android Gradle Plugin 8.3.0 en Kotlin 1.9.22 (reeds geconfigureerd in de projectbestanden).
- Een fysiek toestel of emulator met Google Play-services voor het testen van WorkManager.

## Aan de slag
1. Open het project in Android Studio via **File > Open** en selecteer deze map.
2. Laat Android Studio de Gradle-wrapper downloaden en het project synchroniseren.
3. Start de app op een toestel of emulator.
4. Tik op "Meldingen inschakelen". Op Android 13+ wordt de meldingsmachtiging gevraagd. Zodra deze is geaccepteerd, wordt de WorkManager-taak ingepland en ontvang je elk uur een melding.

## Aanpassen
- Wijzig de tekst van de notificatie in `app/src/main/res/values/strings.xml`.
- Pas het interval aan in `ReminderScheduler.scheduleHourlyReminder()` wanneer je een andere frequentie wil gebruiken.

## Licentie
Deze voorbeeldapplicatie is bedoeld als referentie en wordt geleverd zonder expliciete licentie.
