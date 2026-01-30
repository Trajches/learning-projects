# Grade Calculator
# Converts a score (0–100) into a school grade

punktzahl = int(input("Gib die Punktzahl ein (0-100): "))

if punktzahl < 0 or punktzahl > 100:
    print("Ungültige Eingabe. Bitte gib eine Zahl zwischen 0 und 100 ein.")
else:
    if punktzahl >= 90:
        note = 1
        bewertung = "Sehr gut"
    elif punktzahl >= 80:
        note = 2
        bewertung = "Gut"
    elif punktzahl >= 70:
        note = 3
        bewertung = "Befriedigend"
    elif punktzahl >= 60:
        note = 4
        bewertung = "Ausreichend"
    else:
        note = 5
        bewertung = "Nicht bestanden"

    print(f"Note: {note}, Bewertung: {bewertung}")
