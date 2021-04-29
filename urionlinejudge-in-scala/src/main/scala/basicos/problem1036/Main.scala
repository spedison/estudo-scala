package basicos.problem1036

object Main {


  def calculaDelta(a: Double, b: Double, c: Double): Double = {
    b * b - 4.0D * a * c
  }

  def calcula(delta: Double, a: Double, b: Double, c: Double): Array[Double] = {
    val rDelta = math.sqrt(delta)
    val rets: Array[Double] = Array(
      (-b + rDelta) / (2.0D * a),
      (-b - rDelta) / (2.0D * a))
    rets
  }

  def imprimeContagemValores(a: Double, b: Double, c: Double): String = {

    val delta = calculaDelta(a, b, c)

    if (delta < 0.0 || math.abs(a) < 1E-8)
      return "Impossivel calcular\n"

    val raizes = calcula(delta, a, b, c)

    return "R1 = %.5f\nR2 = %.5f\n".format(raizes(0), raizes(1)).replace(",",".")
  }

  def stringToDouble(lineInput: String): Array[Double] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toDouble)
    entradas
  }

  def main(args: Array[String]): Unit = {

    val entradas = stringToDouble(io.StdIn.readLine())

    if (entradas.length != 3)
      return

    print(imprimeContagemValores(entradas(0), entradas(1), entradas(2)))
  }

}
