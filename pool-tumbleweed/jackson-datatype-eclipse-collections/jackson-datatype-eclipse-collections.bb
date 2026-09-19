SUMMARY = "Add-on module for Jackson to support Eclipse Collections data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and deserialization of \
Eclipse Collections data types."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatype-eclipse-collections-2.18.9-1.1.noarch.rpm"
RPM_HASH = "96dbbcf7cbebb7c39e48d95f58341b685686826aafa17c37cffcf332208f843aa2697060b1285ee1a4680949815a13cf471448f1081ee1385e60a5da8dc401d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-eclipse-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-eclipse-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-eclipse-collections-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-eclipse-collections"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.eclipse.collections-eclipse-collections"

inherit rpm
