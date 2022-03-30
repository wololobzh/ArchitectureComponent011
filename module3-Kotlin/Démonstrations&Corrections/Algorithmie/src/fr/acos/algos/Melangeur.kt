package fr.acos.algos

const val TAILLE_MAX : Int =  4

fun melangeurDeMot(phrase : String) : String {
    val listeDesMotsAMelanger: List<String> = phrase.split(" ")
    var listeDesMotsMelanges = mutableListOf<String>()

    for (mot in listeDesMotsAMelanger) {

        if (mot.length >= TAILLE_MAX) {
            var motMelange = mot.trim().subSequence(1, mot.length - 1).toString()
            var tableauMelange = motMelange.toCharArray()
            tableauMelange.shuffle()
            var str = tableauMelange.joinToString("")
            motMelange = mot[0] + str + mot[mot.length-1]
            listeDesMotsMelanges.add(motMelange)
        } else {
            listeDesMotsMelanges.add(mot)
        }
    }
    return listeDesMotsMelanges.joinToString(" ")
}
fun main() {
    println("Tin tin tin tin");
    var phrase = "Bienvenue chez moi dans cette grande maisonette au dessous des immenses nuages"
    println(melangeurDeMot(phrase));
}
