SUMMARY = "Support for reading and writing Concise Binary Object Representation"
DESCRIPTION = "Jackson data format module that supports reading and writing CBOR ('Concise \
Binary Object Representation') encoded data. Module extends standard Jackson \
streaming API (JsonFactory, JsonParser, JsonGenerator), and as such works \
seamlessly with all the higher level data abstractions (data binding, tree \
model, and pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-cbor-2.18.9-1.1.noarch.rpm"
RPM_HASH = "d36a21f9787fe635fcf7e5ec4040f55a8a386a779aa10da44c4642d4d1cae2be634ffea9e0c9f282a93e17ddcce46d903b98510de7ae0022fc7b7ceccfd99d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-cbor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
