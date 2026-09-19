SUMMARY = "Java manipulation of XML"
DESCRIPTION = "JDOM is a Java-oriented object model which models XML documents. \
It provides a Java-centric means of generating and manipulating \
XML documents. While JDOM inter-operates well with existing \
standards such as the Simple API for XML (SAX) and the Document \
Object Model (DOM), it is not an abstraction layer or \
enhancement to those APIs. Rather, it provides a means of \
reading and writing XML data."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-2.0.6.1-3.9.noarch.rpm"
RPM_HASH = "8eb5b24b17284d7b2dcd137d56125b13906e3f15eab7ab93c1080149609fa98e6d69541faa90ad77a0f23c453c97b149c61926a606b09f8f576a673d58bc8311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2 \
mvn-org.jdom-jdom2 \
mvn-org.jdom-jdom2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
