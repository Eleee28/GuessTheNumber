# Guess the Number

## Overview
This app is a fun interactive game where users try to guess a randomly generated number between 1 and 100. The app provides feedback on whether the guessed number is too hihg, too low or correct. The user can also reset the game to play again. The app keeps track of the number of attempts and displays the previous guesses to assist the player.

## Technologies Used

- **Language**: Kotlin
- **IDE**: Android Studio
- **Framework**: Android SDK

## Requirements

- Android Studio (latest version recommended).
- Android SDK version 21 (Android 5.0) or higher.
- Gradle (should be automatically configured with Android Studio).

## Project Structure

- **![Main Activity](app/src/main/java/com/example/a2numbers/MainActivity.kt)**: The main activity of the app that handles the game logic, including generating random numbers, processing guesses, tracking attempts and resetting the game.
- **![Layout File](app/src/main/res/layout/activity_main.xml)**: This is the layout file that contains the user interface components (input field, result message, buttons).

## How to Run

1. **Clone the Project**: Clone this repository or download the zip file of the project.
2. **Open in Android Studio**: Open the project folder in Android Studio.
3. **Sync Gradle**: Ensure that all dependencies and configurations are set up properly by syncing the Gradle project.
4. **Run the App**: Connect a physical Android device or use an Android emulator, then click on the "Run" button in Android Studio.
5. **Test the App**: You can now input two enter your guesses, see feedback, and reset the game whenever you'd like.
