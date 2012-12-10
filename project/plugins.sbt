addSbtPlugin("com.github.kanterov" % "scleme-sbt" % "0.1-SNAPSHOT" changing())

resolvers ++= Seq(
    "snapshots" at "http://scala-tools.org/repo-snapshots", 
    "releases"  at "http://scala-tools.org/repo-releases",
    "sonatype" at "https://oss.sonatype.org/content/groups/public",
    "twitter-repo" at "http://maven.twttr.com/")

if (java.net.InetAddress.getLocalHost.getHostName == "Glebs-MacBook-Air.local") {
    resolvers += "local snapshots" at "file:///Users/kanterov/git/kanterov.github.com/repo/snapshots"
} else {
    resolvers += "github" at "http://kanterov.github.com/repo/snapshots"
}

