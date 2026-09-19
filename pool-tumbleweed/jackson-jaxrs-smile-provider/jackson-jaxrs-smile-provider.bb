SUMMARY = "Jackson-JAXRS-Smile"
DESCRIPTION = "Functionality to handle Smile (binary JSON) input/output for \
JAX-RS implementations (like Jersey and RESTeasy) using standard \
Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-smile-provider-2.18.9-1.1.noarch.rpm"
RPM_HASH = "acddfcb376867c7296707eaaa0522e077b0369a310f80bd9ea112e5748b07061e4fbf535f357b1451e23da2e67cd221590fad67699e62f36d2c69f92d8424c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-smile-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
