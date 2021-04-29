package estatisticabreeze

import breeze.linalg.{DenseVector, SparseVector, cov}
import breeze.stats.{covmat, mean, meanAndVariance, median, stddev}
import breeze.numerics._

object DenseMatrixBreeze {

  def main(args: Array[String]): Unit = {

    // Vetores
    val dense = DenseVector(1, 2, 3, 4, 5, 6, 7)
    println(dense)

    val dense2 = DenseVector(11, 12, 13, 14, 15, 16, 17)
    println(dense2)

    val sparse = SparseVector(0.0, 1.0, 2.0, 3.0, 5.0, 15.0, 20.0)
    println(sparse)

    val denseZeros = DenseVector.zeros[Double](20)
    println(denseZeros)

    val sparseZeros = SparseVector.zeros[Double](20)
    println(sparseZeros)

    val denseTabulate = DenseVector.tabulate[Double](20)(idx => idx * 2)
    println(denseTabulate)

    // Linearmente Spaçado.
    val linearSpaceVector = breeze.linalg.linspace(2, 10, 50)
    println(linearSpaceVector)

    // Lembrando que o ponto final o intervalo é aberto "[0 10["
    val linearSpaceVector2 = DenseVector.range(0, 10, 1)
    println(linearSpaceVector2)

    val linearSpaceVector3 = DenseVector.rangeD(0.0, 10.0, 0.1)
    println(linearSpaceVector3)

    // Pegando por Slice um pedaço de um vetor.
    val allVector = DenseVector.range(0, 100000, 1)

    // Cuidado que o Slice pega itens exceto o último "[5 10["
    val partDe5a10 = allVector.slice(5, 10, 1)
    println(partDe5a10)

    // vai de 5 a 20 (exceto 20) pulando de 2 em 2.
    val partDe5a20de2Em2 = allVector.slice(5, 20, 2)
    println(partDe5a20de2Em2)

    val partDe5a20de2Em2Somado10 = partDe5a20de2Em2 + 10
    println(partDe5a20de2Em2Somado10)

    val partDe5a20de2Em2Somado10Mult2 = (partDe5a20de2Em2 + 10) * 2
    println(partDe5a20de2Em2Somado10Mult2)

    // Produto Escalar.
    val vP1_1 = DenseVector.range(0, 10)
    val vP1_2 = DenseVector.fill(10, 0)
    val vP1_3 = vP1_1.dot(vP1_2)
    println(s"$vP1_1 . $vP1_2 = $vP1_3")

    val vP2_1 = DenseVector(1, 2, 3, 4, 5, 6)
    val vP2_2 = DenseVector(-6, -5, -4, 3, 2, 1)
    val vP2_3 = vP2_1.dot(vP2_2)
    println(s"$vP2_1 . $vP2_2 = $vP2_3")

    // Soma de 2 Vetores.
    val evenNosTill20 = DenseVector.range(0, 20, 2)
    //DenseVector(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)
    val denseJust2s = DenseVector.fill(10, 2)
    //DenseVector(2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    val additionVector = evenNosTill20 + denseJust2s
    // DenseVector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println(additionVector)

    // Concatenando Vetores.
    val concatenadosVertical = DenseVector.vertcat(additionVector, denseJust2s)
    println(concatenadosVertical)

    val concatenadosHorizontal = DenseVector.horzcat(additionVector, denseJust2s)
    println(concatenadosHorizontal)

    // Converte os tipos;
    val convertidoIntParaDouble = breeze.linalg.convert(concatenadosHorizontal, Double)
    println(convertidoIntParaDouble)

    val valoresAleatorios = DenseVector.tabulate[Double](50000)(idx => 10.0 + math.random())
    val valoresAleatoriosVezes2 = valoresAleatorios * 2.0
    println(s"Média              = ${mean(valoresAleatorios)}")
    println(s"Médiana            = ${median(valoresAleatorios)}")
    println(s"Desvio             = ${stddev(valoresAleatorios)}")
    println(s"Média e Variância  = ${meanAndVariance(valoresAleatorios)}")
    // println(s"Covariância ${cov(valoresAleatoriosVezes2, valoresAleatorios)}")


    print(s"${log(valoresAleatorios)}")

  }


}
