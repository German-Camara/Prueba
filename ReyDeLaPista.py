import random

lista = ["Germán", "Carlos", "Tomás", "Belén", "David"]
malos=["Minion", "Minion", "Minion", "Minion", "Minion", "Minion", "Minion", "Minion", "Minion", "Minion", "Minion"]
muertes = [" a ostia limpia.", " metiéndole cosas por el culo.", " de aburrimiento.", " metiéndole la cabeza por el vater.", " tirándol@ por la ventana.", " de una patada voladora.", " con un puñetazo brutal en la cara."]
resurrecciones = ["porque Chuck Norris le ha frotado su barba.", "porque era demasiado bell@ para estar muerto.", "porque el poder que tiene Pentaho es incuestionable.", "porque sí.", "porque Carmen de Mairena le ha dado un beso en la boca."]
muertos=[]
print("Los participantes son:")
for i in lista:
    print(i)
print("-----------------------------------")

while len(lista)>0 and len(malos)>0:
    print("\033[37m" + "                                                           Buenos (" + str(len(lista)) + ") / Malos (" + str(len(malos)) + ")")
    c=input()

    if c=="r":
        print("\033[32m" + "Se ha activado la resurrección en masa, todos han vuelto a la vida.")

        for i in muertos:
            lista.append(i)
            muertos=[]

    if c=="m":
        malos.append("Minion")
        print("\033[34m" + "Minion añadido")

    if c!="r" and c!="m":
        n = random.randint(0, 1)

        if n==1:
            asesino=random.choice(lista)
            victima=random.choice(malos)

        else:
            asesino = random.choice(malos)
            victima = random.choice(lista)

        #while (asesino==victima):
        #    asesino = random.choice(lista)
        #   victima = random.choice(lista)

        if victima in lista:
            lista.remove(victima)
            muertos.append(victima)

        else:
            malos.remove(victima)

        print("\033[31m" + str(asesino) + " a matado a " + str(victima) + str(random.choice(muertes)))
        m = random.randint(0, 10)

        if m<=3 and len(muertos)>0:
            resucitado=random.choice(muertos)
            print("\033[33m" + str(resucitado) + " a vuelto a la vida " + str(random.choice(resurrecciones)))
            lista.append(resucitado)
            muertos.remove(resucitado)

print("------------------------------------")
if len(lista)==1:
    print("\033[35m" + "El único superviviente es " + str(lista))

if len(lista)==0:
    print("\033[35m" + "No ha habido supervivientes")

if len(lista)>1:
    print("\033[35m" + "Los supervivientes son " + str(lista))