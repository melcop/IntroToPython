from flask import Flask, render_template, request, redirect, url_for
import sqlite3

app = Flask(__name__)

# Opret en funktion til at validere loginoplysningerne
def check_login(brugernavn, password):
    conn = sqlite3.connect('test.db')
    cursor = conn.execute("SELECT * FROM brugere WHERE brugernavn = ? AND password = ?", (brugernavn, password))
    result = cursor.fetchone()
    conn.close()
    if result:
        return True
    else:
        return False

# Opret en route for login-siden
@app.route('/')
def login():
    return render_template('login.html')

# Opret en route for at håndtere login-formularen
@app.route('/login', methods=['POST'])
def login_post():
    brugernavn = request.form['brugernavn']
    password = request.form['password']
    if check_login(brugernavn, password):
        return redirect(url_for('dashboard'))
    else:
        return render_template('login.html', error="Ugyldigt brugernavn eller password")

# Opret en route for dashboardet
@app.route('/dashboard')
def dashboard():
    return "Velkommen til dashboardet"

if __name__ == '__main__':
    app.run()
