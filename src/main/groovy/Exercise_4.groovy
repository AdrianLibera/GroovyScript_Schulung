println("Gebe die Anzahl der Gäste ein:")
def gaeste = Integer.parseInt(System.in.newReader().readLine())

println("Gebe die Anzahl der verfügbaren Kuchenstücke ein:")
def stuecke = Integer.parseInt(System.in.newReader().readLine())

int portion = stuecke/gaeste
def rest = stuecke % gaeste

println("Jeder Gast erhält " + portion + " Kuchenstücke!")
println("Dann bleiben " +rest+" Stücke über!")


