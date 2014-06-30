import JmhKeys._

jmhSettings

//outputTarget in Jmh := target.value / s"scala-${scalaBinaryVersion.value}"

libraryDependencies ++= Seq(
  "net.virtual-void" %% "speed" % "13" % "provided",
  "com.github.scala-blitz" %% "scala-blitz" % "1.0-M1"
)

ScalariformSupport.formatSettings