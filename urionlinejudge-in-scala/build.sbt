name := "urionlinejudge-in-scala"

version := "0.1"

scalaVersion := "2.12.13"

description := "Projeto com soluções do URI ON LINE JUDGE e alguns exercícios para aprender Scala"

resolvers +=  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

// https://mvnrepository.com/artifact/org.scalactic/scalactic
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"






/*libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test exclude("junit", "junit-dep"),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
)*/