from helpers import encrypt

def main():
  phrase = input("What phrase would you like encrypted?")
  code_word = input("What is your encryption word?")
  coded_phrase = encrypt(phrase, code_word)
  print(coded_phrase)

if __name__ == "__main__":
  main()