SUMMARY = "Add-on module for Jackson which handles Guava data-types"
DESCRIPTION = "Add-on datatype-support module for Jackson that handles \
Guava types (currently mostly just collection ones)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatype-guava-2.18.9-1.1.noarch.rpm"
RPM_HASH = "6e5e5f6e7c5f1303cf1466cb54fc6fb43adf3f90dd6f22f91743c928924e93f005a65b84ca31d7b0b18ebfdcc15c0a29b98d7fea7f95cca3bc6b45b301099671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-guava \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-guava \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-guava-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.guava-guava"

inherit rpm
