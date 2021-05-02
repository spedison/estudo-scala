package matematica.problem1202

import scala.io.StdIn

object Main {

//  /***
//   * Esta função que ajuda a converte binário em decimal usando o módulo.
//   * Propriedades do mod:
//   * (A+B) % C = A%C + B%C
//   * (A*B) % C = ((A%C) * (B%c)) % C
//   * @param x
//   * @param y
//   * @return
//   */
//  def exp(x: Int, y: Int, mod:Int): Int = {
//    var p: Int = 1
//    var _y: Int = y
//    var _x: Int = x
//
//    while (_y != 0) {
//      if (_y % 2 == 1) {
//        p = (p * _x) % mod
//        _y -= 1
//      }
//      _x = (_x * _x) % mod
//      _y /= 2
//    }
//    p
//  }

  val mod: Int = 1500
  var fb: Array[Int] = new Array[Int](mod+10)

  def main(args: Array[String]): Unit = {

    fb(1) = 1;
    fb(2) = 1;

    // Tabela com o sequência de fibonat com %1000 de 0 a 1510
    for (i <- (2 to fb.length - 1)) {
      fb(i) = (fb(i - 1) + fb(i - 2)) % 1000;
    }

    val n: Int = StdIn.readInt()
    for (e <- (1 to n)) {
      // Lê entrada em binario e retira os espaços.
      val strBin = StdIn.readLine().trim
      // Converte o binário de "muitos bits" em um long e tira o módulo com mod e converte em um inteiro
      val posFb = BigInt.apply(strBin, 2).mod(mod).toInt
      // Imprime a tabela de fibonati previamente calculado.
      println("%03d".format(fb(posFb)))
    }
  }
}

// Esse trecho de código é usado e
//    for(p <- (1 to n)){
//      val s1 = StdIn.readLine()
//      d = l = 0;
//      for(i = s1.size()-1;i>=0 ;i--){
//        if(s1[i] == '1')
//          d =(d+exp(2,l,mod))%mod;
//        l++;
//      }
//      d = fibo(d);
//      if(d<10) cout <<"00"<<d<<endl;
//      else if(d>=10 && d<100) cout <<"0"<<d<<endl;
//      else cout <<d<<endl;
//    }
//
//    println(exp(10,1500))
