from helpers import alphabet_position , rotate_character

def encrypt(text, rot) :
    coded_text = ""
    for char in text :
        coded_text = coded_text + rotate_character(char, rot)
    return coded_text

def main():
    text = input("Please type the text you would like to encrypt.")
    rot = int(input("How many character would you like to move?"))
    print("You entered:" , text , "and you wanted it rotated by" , rot , "characters.")
    print(encrypt(text, rot))

if __name__ == "__main__":
    main()