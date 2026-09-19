SUMMARY = "Add-on module for Jackson to support PCollections data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and deserialization of \
PCollections data types."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatype-pcollections-2.18.9-1.1.noarch.rpm"
RPM_HASH = "3791c0e771d2babb45007ab85b02105406dc597cc8cb33b94aa90f045e52fa52fb98817ef37f9e3bf6471d866ba853be12a38841bd9cf987ea7a478c932718ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-pcollections \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-pcollections \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-pcollections-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-pcollections"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.pcollections-pcollections"

inherit rpm
