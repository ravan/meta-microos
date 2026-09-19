SUMMARY = "Support for reading and writing YAML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing YAML encoded data. \
SnakeYAML library is used for low-level YAML parsing. This project adds \
necessary abstractions on top to make things work with other Jackson \
functionality."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-yaml-2.18.9-1.1.noarch.rpm"
RPM_HASH = "2bf753692b1139d251d5e5bc532af7fd38079185e4d671d8394e2453fdc47ca32bde479a26036b201e1e2081ca6f49c9892df7b84f609b2f504fcefbe71b060d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-yaml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.yaml-snakeyaml"

inherit rpm
