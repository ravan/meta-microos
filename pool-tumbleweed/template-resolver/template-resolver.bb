SUMMARY = "Contract API for template resolvers"
DESCRIPTION = "Contract API for template resolvers."
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-0.1-3.8.noarch.rpm"
RPM_HASH = "4042ee0e0fb423bbb409604a2d2148738f1a89643192af3cf9a79322febf45af52cdbc6e638ed8fdfaeb556e2f6ed3c26cf625b45f371e1bbfa99b5a3e611ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-template-resolver \
mvn-org.scala-sbt-template-resolver-pom- \
template-resolver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
