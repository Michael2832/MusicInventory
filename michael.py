def alphabet_position(letter):
    if letter.isupper():
        return ord(letter)- 65
    else:
        return ord(letter) - 97

def rotate_character(char, rot):
    pos = (alphabet_position(char) + rot) % 26  
    new_char = chr(pos+ 65)
    if char.islower():
        new_char = new_char.lower()
    return new_char


def encrypt(text, rot):
    cipher = ''
    for i in text:
        if i.isalpha():
            cipher += rotate_character(i,rot)
        else:
            cipher += i
    return cipher

def main():
    text = input("Type a message: \n")
    rot = input("Rotate by: \n")
    rot = int(rot)
    print encrypt(text,rot)




def encrypt(text,key):
    cipher = ''
    l = len(key)
    idx = 0
    for i in text:
        if i.isalpha():
            cipher += rotate_character(i,alphabet_position(key[idx]))
            idx = (idx+1)%1
        else:
            cipher += i
    return cipher

def main():
    text = input("Type a message: \n")
    key = input("encryption key: \n")
    print encrypt(text,key)
   
if __name__ == '__main__':
    main()