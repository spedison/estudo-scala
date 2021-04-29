name := "breeze"

version := "0.1"

scalaVersion := "2.12.13"


// Bibliotecas de Algebra linear.... Tipo Blas.
// https://mvnrepository.com/artifact/org.scalanlp/breeze
libraryDependencies += "org.scalanlp" %% "breeze" % "1.2"
// https://mvnrepository.com/artifact/org.scalanlp/breeze-natives
libraryDependencies += "org.scalanlp" %% "breeze-natives" % "1.2"
libraryDependencies += "org.scalanlp" %% "breeze-viz" % "1.2"

// Bibliotecas de Teste Unitário
// libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
// https://mvnrepository.com/artifact/org.scalactic/scalactic
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"