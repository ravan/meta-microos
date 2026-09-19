SUMMARY = "Java XML parser"
DESCRIPTION = "Xerces2 is an XML parser in the Apache Xerces family. This version is the \
reference implementation of the Xerces Native Interface (XNI), a modular \
framework for building parser components and configurations. \
 \
Xerces2 implements the Document Object Model Level 3 Core and Load/Save W3C \
Recommendations, the XML Inclusions (XInclude) W3C Recommendation, and supports \
OASIS XML Catalogs v1.1. It can parse documents conforming to the XML 1.1 \
Recommendation, except that it does not yet provide an option to enable \
normalization checking as described in section 2.13 of this specification. It \
handles name spaces according to the XML Namespaces 1.1 Recommendation, and \
serializes XML 1.1 documents if the DOM level 3 load/save APIs are in use."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-2.12.2-5.6.noarch.rpm"
RPM_HASH = "329f01afd20bac5115884f0cb110c5876b0047391362ac4b259584652220951cf2140b4940391676809544ffa065eb131fa492df8b98922264afe76fb86d7f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-apache-xerces-j2 \
mvn-apache-xerces-j2-pom- \
mvn-xerces-xerces \
mvn-xerces-xerces-pom- \
mvn-xerces-xercesImpl \
mvn-xerces-xercesImpl-pom- \
mvn-xerces-xmlParserAPIs \
mvn-xerces-xmlParserAPIs-pom- \
osgi-org.apache.xerces \
xerces-j2 \
xerces-j2-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-xml-apis-xml-apis \
osgi-javax.xml \
osgi-org.apache.xml.resolver \
osgi-org.apache.xml.serializer"

inherit rpm
