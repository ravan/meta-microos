SUMMARY = "The StAX API"
DESCRIPTION = "The Streaming API for XML (StAX) is Java API for \
parsing and writing XML easily and efficiently."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-api-1.2.0-1.8.noarch.rpm"
RPM_HASH = "38b8e2bb56c9e9b351b7e50ea0b333a66f9878770d45ccabf037772b9332fe4c4851a0b9ddfe3efe31a2be68432f101a97202b8ed89c5ff76171abf18492abc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax-api \
mvn-javax.xml.stream-stax-api \
mvn-javax.xml.stream-stax-api-pom- \
mvn-stax-stax-api \
mvn-stax-stax-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
