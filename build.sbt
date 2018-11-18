lazy val akkaHttpVersion = "10.1.5"
lazy val akkaVersion    = "2.5.18"
lazy val slickVersion = "3.2.1"
lazy val mySqlVersion = "5.1.34"
lazy val flywayVersion = "5.0.7"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.exampleslick",
      scalaVersion    := "2.12.7"
    )),
    name := "sample-slick",
    libraryDependencies ++= Seq(

      //Akka packages
      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,

      //Database packages
      "com.typesafe.slick" %% "slick"                               % slickVersion,
      "com.typesafe.slick" %% "slick-hikaricp"                      % slickVersion,
      "mysql"              % "mysql-connector-java"                  % mySqlVersion,

      //Migration tool
      "org.flywaydb"       %  "flyway-core"                          % flywayVersion,

      //Test packages
      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test,
    )
  )
