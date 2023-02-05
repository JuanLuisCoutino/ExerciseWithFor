import javax.swing.JOptionPane

var altura = JOptionPane.showInputDialog("Escribe el numero de tu escalera").toInt()
 for (numAstericos in (1 .. altura)){
     for (i in (1 .. numAstericos)){
         print("*")
 }
 println("")
}