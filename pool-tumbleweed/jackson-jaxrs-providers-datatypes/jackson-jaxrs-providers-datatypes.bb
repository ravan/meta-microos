SUMMARY = "Functionality for reading/writing core JAX-RS helper types"
DESCRIPTION = "Functionality for reading/writing core JAX-RS helper types."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-providers-datatypes-2.18.9-1.1.noarch.rpm"
RPM_HASH = "9f86607d1c52056ca7bad0e364e73aef1caa77328044bd3995c7b5a0e6f5740d44910dcf14e07bce8544ca913d878bfc150c129a839102721c1765534f8c108f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-datatypes \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-jaxrs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
