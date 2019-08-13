from flask import Flask

app = Flask(__name__)
app.config['DEBUG'] = True

def main():
    return "Bonjour World"

    app.run()