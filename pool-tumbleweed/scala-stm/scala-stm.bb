SUMMARY = "Software Transactional Memory for Scala"
DESCRIPTION = "ScalaSTM is a lightweight software transactional memory \
for Scala, inspired by the STMs in Haskell and Clojure. \
 \
ScalaSTM provides a mutable cell called a Ref. If you \
build a shared data structure using immutable objects and \
Ref-s, then you can access it from multiple threads or \
actors. No synchronized, no deadlocks or race conditions, \
and good scalability. Included are concurrent sets and \
maps, and we also have an easier and safer replacement \
for wait and notifyAll."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "scala-stm-0.11.1-2.7.noarch.rpm"
RPM_HASH = "1687de4dee136f0d274d91d651f5bd89029c20bd71b072e1c48836af91cfc752a67c86b1b30e305c7218cd48be7a213ce5e0149ebdd91d42a26c4fe6b664a95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-stm-scala-stm-2.13 \
mvn-org.scala-stm-scala-stm-2.13-pom- \
scala-stm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
