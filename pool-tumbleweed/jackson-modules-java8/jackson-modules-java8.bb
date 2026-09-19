SUMMARY = "Set of support modules for Java 8 datatypes"
DESCRIPTION = "This is a multi-module umbrella project for Jackson modules needed to support \
Java 8 features, especially with Jackson 2.x that only requires Java 7 for \
running (and until 2.7 only Java 6)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-modules-java8-2.18.9-1.1.noarch.rpm"
RPM_HASH = "199c247f8945c7b02206ed72a6b28cd6d11177671e750b5a1922e824282e4dddd98368e30a272229cb90acb716b630837134fd315eb1773c96a121e6dfdd6de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-java8 \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jdk8 \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jdk8-pom- \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jsr310 \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jsr310-pom- \
mvn-com.fasterxml.jackson.module-jackson-module-parameter-names \
mvn-com.fasterxml.jackson.module-jackson-module-parameter-names-pom- \
mvn-com.fasterxml.jackson.module-jackson-modules-java8-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-jdk8 \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-jsr310 \
osgi-com.fasterxml.jackson.module.jackson-module-parameter-names"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
