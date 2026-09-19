SUMMARY = "Java 8 compatibility kit for Scala"
DESCRIPTION = "A Java 8 compatibility kit for Scala 2.12 and 2.11."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "scala-java8-compat-1.0.2-2.7.noarch.rpm"
RPM_HASH = "833b562a2b0348da308597000c984f6ef399ef4f5238690a031e4290bb1c3ae202e0619465c3f0880546817a39222ced60e45becd51f9f536e54b43e90970afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-lang.modules-scala-java8-compat-2.13 \
mvn-org.scala-lang.modules-scala-java8-compat-2.13-pom- \
scala-java8-compat"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
