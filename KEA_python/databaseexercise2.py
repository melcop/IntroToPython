import sqlite3

# Opret forbindelse til databasen
conn = sqlite3.connect('test.db')

# Opret en tabel med kolonnerne 'id', 'navn' og 'alder'
conn.execute('''CREATE TABLE IF NOT EXISTS personer
             (id INTEGER PRIMARY KEY AUTOINCREMENT,
             navn TEXT NOT NULL,
             alder INTEGER NOT NULL);''')

# Indsæt nogle rækker i tabellen
conn.execute("INSERT INTO personer (navn, alder) VALUES ('Peter', 27)")
conn.execute("INSERT INTO personer (navn, alder) VALUES ('Sara', 32)")
conn.execute("INSERT INTO personer (navn, alder) VALUES ('Mikkel', 19)")

# Opdater alderskolonnen for en bestemt række ved hjælp af dens id
conn.execute("UPDATE personer SET alder = ? WHERE id = ?", (25, 2))

# Gem ændringer og luk forbindelsen til databasen
conn.commit()
conn.close()

# Udskriv rækkerne fra tabellen
conn = sqlite3.connect('test.db')
cursor = conn.execute("SELECT * FROM personer")
for row in cursor:
    print(row)
conn.close()