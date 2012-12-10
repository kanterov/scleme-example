addSbtPlugin("com.github.kanterov" % "scleme-sbt" % "0.1-SNAPSHOT" changing())

if (java.net.InetAddress.getLocalHost.getHostName == "Glebs-MacBook-Air.local") {
    resolvers += "local snapshots" at "file:///Users/kanterov/git/kanterov.github.com/repo/snapshots"
} else {
    resolvers += "github" at "http://kanterov.github.com/repo/snapshots"
}

