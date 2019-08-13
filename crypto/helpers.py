def alphabet_position(letter) :
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    cap_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val = 0
    count = 0
    for item in alphabet :
        if item == letter :
            val = count
        count = count + 1

    count = 0
    for item in cap_alpha :
        if item == letter :
            val = count
        count = count + 1

    return val

def rotate_character(char, rot) :
    #this is capital
    if char.isalpha() == True and ord(char) < 91 :
        need_num = (ord(char) - ord("A") )
        rot_num = (need_num + rot) % 26
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        new_char = alphabet[rot_num]
        return new_char
    
    #this is lower case
    elif char.isalpha() == True and ord(char) > 90 :
        need_num = (ord(char) - ord("a") )
        new_num = (need_num + rot) % 26
        alphabet = "abcdefghijklmnopqrstuvwxyz"
        new_char = alphabet[new_num]
        return new_char

    # if not alphabet
    else :
        return char

def encrypt(phrase, code_word) :
    coded_phrase = ""
    counter = 0
    for letter in phrase :
        if letter.isalpha() == False :
            coded_phrase = coded_phrase + letter
        else:
            # get rot
            counter = counter + 1
            char_num = (counter-1) % len(code_word)
            rot_letter = ((code_word[char_num]).lower())
            rot_num = (ord(rot_letter) - ord("a"))
            new_letter = rotate_character(letter, rot_num)
            coded_phrase = coded_phrase + new_letter
    return coded_phrase

        