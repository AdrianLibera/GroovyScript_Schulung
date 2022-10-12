int[] ziehung = new int[6];
for (int i = 0; i < 7; ++i) {
    ziehung[i] = (int) (Math.random() * 49 + 1);    /*
                                                        Generiere mir eine zufällige Zahl und
                                                        speicher diese in Arrayposition i ein */
    for (int j = 0; j < i; ++j) {                   /*   Wiederhole den Schritt, falls die neue Zahl
                                                        ein Duplikat der vorherigen ist */
        if (ziehung[j] == ziehung[i])
            --i;
    }
}
for (int i = 0; i < 6; ++i) {                       // Gib mir das Ergebnis aus
    System.out.println(ziehung[i]);
}

