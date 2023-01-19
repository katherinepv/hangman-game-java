# Pseudocode for Hangman Game

- Create a list of words to be used as a library for the random word generator to choose from.
- Create a random word generator to be used for each new game and generate the random word.
- Display the random word dashed out to hide the word that must be guessed.
- Set initial lives left to 5.
- Set guessed letters to 0.
- Check if word to guess matches guessed letter by user.
- If it matches: reveal the letter in its correct position in the word by replacing the dash with the corresponding letter. Tell user how many lives left.
- If it doesn't match: lose a life. Tell user a life has been lost and total lives left.
- If guessed letter has already been guessed, tell user.
- If all 5 lives lost, tell user 'Game Over'.
- If all letters guessed correctly and lives lost is less than 5, tell user 'You Won'.
- Allow user to start game again.