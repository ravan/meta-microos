SUMMARY = "Apache XML Security for Java"
DESCRIPTION = "Apache XML Security for Java supports XML-Signature Syntax and Processing, \
W3C Recommendation 12 February 2002, and XML Encryption Syntax and \
Processing, W3C Recommendation 10 December 2002. As of version 1.4, \
the library supports the standard Java API JSR-105: XML Digital Signature APIs."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-2.1.7-5.10.noarch.rpm"
RPM_HASH = "406d0505547555115bd833939051ddd3071ce3f807d91039b1aa230126c4eca70318b485424a4719279cbb8694ce4f4ee1708c09851f086e76dc03f861117bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.santuario-xmlsec \
mvn-org.apache.santuario-xmlsec-pom- \
osgi-org.apache.santuario.xmlsec \
xml-security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-commons-codec-commons-codec \
mvn-org.slf4j-slf4j-api"

inherit rpm
