name := "urionlinejudge-in-scala"

version := "0.1"

scalaVersion := "2.12.13"

description := "Projeto com soluções do URI ON LINE JUDGE e alguns exercícios para aprender Scala"

resolvers +=  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

// Bibliotecas de Algebra linear.... Tipo Blas.
// https://mvnrepository.com/artifact/org.scalanlp/breeze
libraryDependencies += "org.scalanlp" %% "breeze" % "1.2"
// https://mvnrepository.com/artifact/org.scalanlp/breeze-natives
libraryDependencies += "org.scalanlp" %% "breeze-natives" % "1.2"
libraryDependencies += "org.scalanlp" %% "breeze-viz" % "1.2"

// libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
// https://mvnrepository.com/artifact/org.scalactic/scalactic
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"

libraryDependencies +="org.apache.poi" % "poi" % "4.0.0"
libraryDependencies +="org.apache.poi" % "poi-ooxml" % "4.0.0"

// https://mvnrepository.com/artifact/org.projectlombok/lombok
libraryDependencies += "org.projectlombok" % "lombok" % "1.18.20" % "provided"



// Colocar a bilioteca do Spark para leitura de DataSets.
// https://spark.apache.org/downloads.html
// https://spark.apache.org/docs/latest/index.html
// https://gist.github.com/DenysNunes/e0f17c82d32c8c13b064
// https://github.com/arunma/ScalaDataAnalysisCookbook/tree/master/chapter1-spark-csv/

// Lendo o XLSX
// https://www.devmedia.com.br/apache-poi-manipulando-documentos-em-java/31778

/*libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test exclude("junit", "junit-dep"),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
)*/