import java.util.Calendar

println("Teste Simple-Commands")

def getCiclieStats(r: Double): (Double, Double) = {
  val PI = 3.14

  def area(r: Double): Double = PI * r * r

  def perimeter(r: Double): Double = 2 * PI * r

  (area(r), perimeter(r))
}

print(getCiclieStats(10.01))

// Função Ascentente
def compareStrAsc(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 < s2) -1
  else 1
}

// Função Descendente.
def compareStrDesc(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 < s2) 1
  else -1
}

def compara(s1: String, s2: String, cmp: (String, String) => Int = compareStrAsc): Int = {
  cmp(s1, s2)
}
// Criei uma variável do tipo função já atribundo os valores usando placeholder.
val comparaPlaceHolder = compara(_: String, _: String, compareStrAsc) // Ele pega os parâmetros passados e repassa na orderm para a função
println("Comparando A e B ==> " + comparaPlaceHolder("A", "B"))

// Simplesmente compara usando a função passada.
def comparacaoInteligente(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
  cmpFn(s1, s2)
}

// Usa a função passada e tona ela insensível a maiuscula e minuscula
def comparacaoInsensivel(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
  cmpFn(s1.toUpperCase(), s2.toUpperCase())
}

print(comparacaoInsensivel("Edison ", "EdIsOn", compareStrAsc))


def getFuncaoComparacao(asc: Boolean = true, sensivel: Boolean): (String, String) => Int = {

  // Transforma uma função sentitive case em insensitive case.
  def funcInsensivel(cmp: (String, String) => Int): (String, String) => Int = {
    def funcRet(str1: String, str2: String): Int = cmp(str1.toLowerCase(), str2.toLowerCase())

    funcRet
  }

  if (asc) {
    if (sensivel) compareStrAsc
    else funcInsensivel(compareStrAsc)
  } else {
    if (sensivel) compareStrDesc
    else funcInsensivel(compareStrDesc)
  }
}

// Usando curring (Escovado, Preparado) na verdade de 2 grupos de parâmetros.
// Envio de funções para funções para complementar a notação de placeholder.
def curriedCompare(cmpFn: (String, String) => Int)(s1: String, s2: String): Int = {
  cmpFn(s1, s2)
}

def curriedCompareInsensivel(cmpFn: (String, String) => Int)(s1: String, s2: String): Int = {
  cmpFn(s1.toLowerCase(), s2.toLowerCase())
}

println("Curried parâmeters sensível   : " + curriedCompare(compareStrDesc)("Edison", "Alessandra"))
println("Curried parâmeters sensivel   : " + curriedCompare(compareStrDesc)("Edison", "eDison"))
println("Curried parâmeters insensivel : " + curriedCompareInsensivel(compareStrDesc)("Edison", "edISon"))

// Podemos aqui usan a notação de placeholder junto para tornar mais conciso.

val compPlaceholder2 = curriedCompare(compareStrAsc)(_: String, _: String): Int

println("Curried com placeholder : " + compPlaceholder2("Edison", "edISon"))
println("Curried com placeholder : " + compPlaceholder2("Edison", "Edison"))


val s1 = "Edison"
val s2 = "EdIson"
val s3 = "aMersoN"

println("Asc = True, Sens = True :: " + getFuncaoComparacao(true, true)(s1, s2))
println("Asc = True, Sens = False :: " + getFuncaoComparacao(true, false)(s1, s2))
println("Asc = True, Sens = True :: " + getFuncaoComparacao(true, true)(s1, s3))
println("Asc = True, Sens = False :: " + getFuncaoComparacao(true, false)(s1, s3))
println("Asc = True, Sens = True :: " + getFuncaoComparacao(true, true)(s1, s3))

println("Compara => Clara, Edison ", compara("Clara", "Edison"))
println("ComparaAsc => Clara, Edison ", compara("Clara", "Edison", compareStrAsc))
println("ComparaDesc => Clara, Edison ", compara("Clara", "Edison", compareStrDesc))

val soma2f = (v1: Int) => {
  v1 + 2
}: Int
def soma2def(v1: Int): Int = {
  v1 + 2
}
println(soma2f(10.toInt))
println(soma2def(10.toInt))

val someNumbers = List(10, 20, 30, 40, 70)

// Usando placeholder
println(java.util.Arrays.toString(someNumbers.filter(_ > 25).toArray))
// Usando notação expandida
println(java.util.Arrays.toString(someNumbers.filter(x => x > 25).toArray))

// Usando notação de placeholder com 2 parametros.
val f = (_: Int) + (_: Int)
f(21, 10) // 31


// closures.

def greeting(lang: String) = {
  val currDate = Calendar.getInstance().getTime().toString
  lang match {
    case "Portuguese" => (x: String) => println("Ola " + x + ". It is " + currDate)
    case "English" => (x: String) => println("Hello " + x + ". It is " + currDate)
    case "Hindi" => (x: String) => println("Namaste " + x + ". It is " + currDate)
    case "French" => (x: String) => println("Bomjour " + x + ". It is " + currDate)
    case "Spanish" => (x: String) => println("Hola " + x + ". It is " + currDate)
  }
}
print("SAUDAÇÃO: ")

// Este é um Closure.
// É uma função.
// AS variáveis que ele usa, ele encapsula e cria um ambiente para chamar isoladamente depois.
val portHello = greeting("Portuguese")
val engHello = greeting("English")

portHello("Edison")
engHello("Edison")

/// Alguns exemplos de listagem
val duasSemanas = List("Seg", "Ter", "Qua", "Qui", "Sex", "Sab", "Dom")
var restoDaSemana = duasSemanas
// while (restoDaSemana != Nil ) { // Ou
while (! restoDaSemana.isEmpty ) {
  println(s"Hoje é ${restoDaSemana.head}, temos ${restoDaSemana.size} para o fim de semana")
  restoDaSemana = restoDaSemana.tail
}


