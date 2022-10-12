println("Übung 3")
String[] arrString = ['Apfelschorle', 'Cola', 'Sprite']
println("Elemente des Arrays: ")
for( i in arrString) {
    println(i)
}
println("Anzahl der Elemente " + arrString.length)
if(arrString.length >= 3) {
    arrString[1] = "Mineralwasser"
    println(arrString[1])
}else {
    println("Versuch es nochmal")
}
