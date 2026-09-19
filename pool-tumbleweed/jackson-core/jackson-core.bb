SUMMARY = "Core part of Jackson"
DESCRIPTION = "Core part of Jackson that defines Streaming API as well \
as basic shared abstractions."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-core-2.18.9-2.1.noarch.rpm"
RPM_HASH = "47e55d3c03bc99b5d760554bb056cf7dc4258658c5fc4f11469934ddbf9be7aa8ad1f8657c2af5696b2220ef1f16679939496887803311e0f8e32e64d16b0e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core-pom- \
osgi-com.fasterxml.jackson.core.jackson-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
