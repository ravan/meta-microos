SUMMARY = "Simple combinator-based parsing for Scala"
DESCRIPTION = "Simple combinator-based parsing for Scala. Formerly part of the Scala \
standard library, now a separate community-maintained module"
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "scala-parser-combinators-2.3.0-2.7.noarch.rpm"
RPM_HASH = "2a4a2852352b0f7b55c51fb65b3e6f330befe8595f51e931a4533c3db802a454783bcffe72cadd0cd1f401754675d76776e4614f928137c268adb5d19b7866d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-lang.modules-scala-parser-combinators-2.13 \
mvn-org.scala-lang.modules-scala-parser-combinators-2.13-pom- \
scala-parser-combinators"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
