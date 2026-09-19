SUMMARY = "Codemodel Core"
DESCRIPTION = "The core functionality of the CodeModel java source code generation \
library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-2.3.1-12.4.noarch.rpm"
RPM_HASH = "bca06fdf3cd1139cebb7b3ea92638e502762fe9755a8ebe95b6bc389b457549cda21d31343ee0989b6813443ca894055dc652c5804003e007c31d19318715836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-codemodel-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
