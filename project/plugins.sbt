// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.19")

addSbtPlugin("com.gilt.sbt" % "sbt-newrelic" % "0.3.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
