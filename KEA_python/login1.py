import sqlite3

# Opret forbindelse til databasen
conn = sqlite3.connect('test.db')

# Opret en tabel med kolonnerne 'id', 'brugernavn' og 'password'
conn.execute('''CREATE TABLE IF NOT EXISTS brugere
             (id INTEGER PRIMARY KEY AUTOINCREMENT,
             brugernavn TEXT NOT NULL UNIQUE,
             password TEXT NOT NULL);''')

# Indsæt nogle rækker i tabellen
conn.execute("INSERT INTO brugere (brugernavn, password) VALUES ('admin', '1234')")
conn.execute("INSERT INTO brugere (brugernavn, password) VALUES ('user', 'password')")

# Gem ændringer og luk forbindelsen til databasen
conn.commit()
conn.close()