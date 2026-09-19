SUMMARY = "Jackson extension component for reading and writing XML encoded data"
DESCRIPTION = "Data format extension for Jackson (http://jackson.codehaus.org) \
to offer alternative support for serializing POJOs as XML and \
deserializing XML as POJOs. Support implemented on top of Stax API \
(javax.xml.stream), by implementing core Jackson Streaming API types \
like JsonGenerator, JsonParser and JsonFactory. Some data-binding types \
overridden as well (ObjectMapper sub-classed as XmlMapper)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-xml-2.18.9-1.1.noarch.rpm"
RPM_HASH = "58174bfc8c4a9450cd247b8f4d3d4951475cca4dc321cda20d6bc94997dc577cae4c5402e2f4d194ecf5da990fbf424e5dc27927bd84027c366153319bd61b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-xml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
