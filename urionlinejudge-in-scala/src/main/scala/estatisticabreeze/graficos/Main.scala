package estatisticabreeze.graficos

object Main {

  def main(args: Array[String]) = {

    import breeze.linalg._
    import breeze.plot._
    import breeze.numerics._

    val f = Figure()
    val p = f.subplot(2,2,0)
    val x = linspace(-10.0,10.0)
    p += plot(x, sin(x), '.')
    p += plot(x, cos(x), '.')
    p.title = "lines plotting - Scatter"

    val p2 = f.subplot(2,2,1)
    val g2 = breeze.stats.distributions.Gaussian(0,1)
    p2 += hist(g2.sample(100000),100)
    p2.title = "A normal distribution"

    val p3 = f.subplot(2,2,2)
    val g3 = breeze.stats.distributions.Poisson(5)
    p3 += hist(g3.sample(100000),100)
    p3.title = "A poisson distribution"

    val p4 = f.subplot(2,2,3)
    p4 += image(DenseMatrix.rand(200,200))
    p4.title = "A random distribution"
    f.saveas("/mnt/dados/git/urionlinejudge-in-scala/arquivos/image.png")
    f.visible = false

  }

}