import sqlite3

def check_login(brugernavn, password):
    conn = sqlite3.connect('test.db')
    cursor = conn.execute("SELECT * FROM brugere WHERE brugernavn = ? AND password = ?", (brugernavn, password))
    result = cursor.fetchone()
    conn.close()
    if result:
        return True
    else:
        return False

brugernavn = input("Indtast brugernavn: ")
password = input("Indtast password: ")

if check_login(brugernavn, password):
    print("Login succesfuldt")
else:
    print("Login mislykkedes")