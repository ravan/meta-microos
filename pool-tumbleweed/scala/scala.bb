SUMMARY = "Hybrid functional/object-oriented language for the JVM"
DESCRIPTION = "Scala is a general purpose programming language designed to express \
common programming patterns in a concise, elegant, and type-safe way. \
It smoothly integrates features of object-oriented and functional \
languages.  It is also fully interoperable with Java."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "2.13.12"

RPM_NAME = "scala-2.13.12-3.2.noarch.rpm"
RPM_HASH = "6bf8ee4a49a1f9548fbe1c58fc53368ef7aadfb3bdd72c6a4fa0d2dd104eb35f47ee987b5ffdfa30ec24b6588f98c08e639cee6b1140431808ebd1fe905badb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-compiler-pom- \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-library-pom- \
mvn-org.scala-lang-scala-reflect \
mvn-org.scala-lang-scala-reflect-pom- \
mvn-org.scala-lang-scalap \
mvn-org.scala-lang-scalap-pom- \
osgi-org.scala-lang.scala-compiler \
osgi-org.scala-lang.scala-library \
osgi-org.scala-lang.scala-reflect \
scala \
scala-bootstrap"

RDEPENDS:${PN} += "/usr/bin/env \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-io.github.java-diff-utils-java-diff-utils \
mvn-net.java.dev.jna-jna \
mvn-org.jline-jline"

inherit rpm
