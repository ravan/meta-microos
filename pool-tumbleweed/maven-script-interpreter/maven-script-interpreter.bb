SUMMARY = "Maven Script Interpreter"
DESCRIPTION = "This component provides some utilities to interpret/execute some scripts for \
various implementations: Groovy or BeanShell. \
 \
Groovy script is currently disabled."
LICENSE = "Apache-2.0"

PV = "1.8"

RPM_NAME = "maven-script-interpreter-1.8-1.1.noarch.rpm"
RPM_HASH = "a89513606acf8177e9bbeb970cc186e730936fc9514fdfd116482f80b8d7d11c269b65d61fe5ce3a94f1175e2b2350d3d9f75ff839266b2d80d64b6d9d350ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.maven.shared-maven-script-interpreter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.slf4j-slf4j-api"

inherit rpm
