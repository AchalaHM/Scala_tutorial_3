object Q_4 extends App {
      def coverPrice (n : Int) ={
        n * 24.95 *60/100
      }

      def shippingCost4after50 (m: Int)={
        m* 0.75
      }
  println("Total cost is " + ( coverPrice(60) + 3 + shippingCost4after50(10)))
}
