SUMMARY = "Add-on module for Jackson to support HPPC data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and \
deserialization of High-Performance Primitive Collections \
data-types."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatype-hppc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "5ebc92eb5d11119842b012704d1c19abe9021b936fd1155cccda3e8316de945830c36640e9a803df99c43b579b61195279474271181849bba804ba34597357f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-hppc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.carrotsearch-hppc \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
