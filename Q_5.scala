object Q_5 extends App {
      def easyPace (i : Int) ={
        i * 8
      }

      def tempPace (j : Int)={
        j * 7
      }
    println("Total running time is " + (easyPace(2)+tempPace(3)+easyPace(2) )+ " minutes")
}
