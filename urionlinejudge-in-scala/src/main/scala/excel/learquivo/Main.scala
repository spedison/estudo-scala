package excel.learquivo

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.util
// import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.{Row,Cell}
//import org.apache.poi.hssf.usermodel.HSSFSheet
//import org.apache.poi.xssf.usermodel.{HSSFCell, HSSFRow}

import scala.collection.mutable.ListBuffer


case class DepConta (nome:String, contagem:Int){}

object Main {

  def main(args: Array[String]): Unit = {
    main2(Array("/home/edisonribeiroaraujo/Documentos/dados-para-processar/xls-exemplos/FONTE_Orgaos_20191119.xlsx"))
  }

  def main2(args: Array[String]): Unit = {


    val arqExcel: FileInputStream = new FileInputStream(new File(args(0)));

    val workbook = new XSSFWorkbook(arqExcel)

    val contaSheets = workbook.getNumberOfSheets
    println(s"Esse Arquivo tem $contaSheets planilhas, vou pegar somente a primeira")

    val sheetAlunos = workbook.getSheetAt(0)

    val rowIterator:util.Iterator[Row] = sheetAlunos.iterator

    var listaOrgaos = new ListBuffer[Orgao]

    // Ignora a primeira linha
    rowIterator.next()

    while (rowIterator.hasNext) {
      val rows: Row = rowIterator.next()
      val cellIter: util.Iterator[Cell] = rows.cellIterator()

      var codigo: Int = 0 // Coluna 0
      var sessao: String = "" // Coluna 2
      var descricao: String = "" // Coluna 4
      var ambito: String = "" //Coluna 5

      var pos: Int = 0
      while (cellIter.hasNext) {
        val celula: Cell = cellIter.next()


        val ok = pos match {
          case 0 => {
            codigo = celula.getNumericCellValue.toInt
            true
          }
          case 2 => sessao = celula.getStringCellValue; true
          case 4 => descricao = celula.getStringCellValue; true
          case 5 => ambito = celula.getStringCellValue; true
          case _ => false
        }
        pos += 1
        println(s"Lendo coluna $pos")
      }
      val orgao: Orgao = Orgao(codigo, sessao, descricao, ambito)
      listaOrgaos.append(orgao)

    }

    // var orgao: Orgao = new Orgao(10, "UR-10", "Teste", "E")
    //print(orgao.codigo)
    println(s"Quantidade de entidades Estaduais ${listaOrgaos.filter(_.ambito == "E").size}")
    println(s"Quantidade Total ${listaOrgaos.size}")
    println(s"Quantidade de entidades Estaduais ${listaOrgaos.size}")

    // val departamentos = listaOrgaos.map(_.Sessao.trim.toLowerCase()).distinct

    // val contagem = departamentos.transform( DepConta(_, listaOrgaos.count(_.Sessao.trim.toLowerCase() == _)))

  }

}
