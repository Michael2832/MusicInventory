x = input("Enter a sentence")

letter_count = {} 
for char in x: 
    if char in letter_count:
        letter_count[char] = letter_count[char] + 1
    else:
        letter_count[char] = 1

for char in sorted(letter_count):
    print(char, letter_count[char])