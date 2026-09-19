SUMMARY = "Jackson module that uses byte-code generation to further speed up data binding"
DESCRIPTION = "Module that will add dynamic bytecode generation for standard Jackson POJO \
serializers and deserializers, eliminating majority of remaining data binding \
overhead."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-afterburner-2.18.9-1.1.noarch.rpm"
RPM_HASH = "a41ea704ae650e7e4ef9816026b17b783672de5cc1e6876d77f417c92bbeaab38176696dd1497257f48163cba94e5b50361b9601ed965aeaad863e5c0eb87bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-afterburner \
mvn-com.fasterxml.jackson.module-jackson-module-afterburner \
mvn-com.fasterxml.jackson.module-jackson-module-afterburner-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-afterburner"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.ow2.asm-asm"

inherit rpm
