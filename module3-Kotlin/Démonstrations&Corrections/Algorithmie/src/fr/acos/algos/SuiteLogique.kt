package fr.acos.algos

fun main() {
    var debut = System.currentTimeMillis()

    var suite = "1"
    println(suite)

    for(i in 0..40)
    {
        suite = suite(suite)
        println(suite)
    }

    var fin = System.currentTimeMillis()

    println("temps : " + (fin - debut) + " ms")
}

fun suite(suite:String):String {
    var suiteSuivante:StringBuilder = StringBuilder("");
    var caractereDavant = '#';
    var compteur = 0

    for((index,caractere) in suite.withIndex())
    {
        if(caractereDavant == '#')
        {
            caractereDavant = caractere
            compteur++
            if(index == suite.length-1)
            {
                suiteSuivante.append(compteur)
                suiteSuivante.append(caractere)
            }
        } else if(caractere == caractereDavant)
        {
            compteur++
            if(index == suite.length-1)
            {
                suiteSuivante.append(compteur)
                suiteSuivante.append(caractere)
            }
        } else if(caractere != caractereDavant)
        {
            suiteSuivante.append(compteur)
            suiteSuivante.append(caractereDavant)
            compteur = 1
            caractereDavant = caractere

            if(index == suite.length-1)
            {
                suiteSuivante.append(compteur)
                suiteSuivante.append(caractere)
            }
        }
    }
    return suiteSuivante.toString();
}
