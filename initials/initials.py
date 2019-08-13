def get_initials(fullname):
    """ Given a person's name, returns the person's initials (uppercase) """
    # TODO your code here
    intials = " "
    names = fullname.split(" ")
    for name in names :
        intials = intials + name[0]
        
    return intials.upper()

def main():
    # some more code here (input and print statements)
    name = input("Type your full name to get your intials.")

    print(get_initials(name))

if __name__ == '__main__':
    main()
