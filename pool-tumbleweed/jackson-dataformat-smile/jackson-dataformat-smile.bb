SUMMARY = "Support for reading and writing Smile encoded data using Jackson abstractions"
DESCRIPTION = "This Jackson extension handles reading and writing of data encoded in Smile \
data format ('binary JSON'). It extends standard Jackson streaming API \
(JsonFactory, JsonParser, JsonGenerator), and as such works seamlessly with \
all the higher level data abstractions (data binding, tree model, and \
pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-smile-2.18.9-1.1.noarch.rpm"
RPM_HASH = "47cbf218b111d430118eda502f61e86551654867204868b01cc6733ff6c2f9fb807dfb0fd189535f43e4cc9a168e577b53f1140b62b285804a2396f9b4b46576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-smile \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-smile"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
