object Q_4 extends App {
      def coverPrice (n : Int) ={
        n * 24.95 *60/100
      }

      def shippingCost (m: Int)={
        if (m > 50){3+ (m-50)*0.75}
        else {3}
      }
  println("Total cost is " + ( coverPrice(60) + shippingCost(60)))
}
