SUMMARY = "Java XSLT processor"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-2.7.3-4.6.noarch.rpm"
RPM_HASH = "368bde39b0e238eece9e8be2b6b4d320a4a64da54eae56baabc469fe868fef023bebae52c9210859baf3f784d1c8014a78ba738387730dd8bbc8444c0e83f17c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xalan-j2 \
mvn-xalan-serializer \
mvn-xalan-serializer-pom- \
mvn-xalan-xalan \
mvn-xalan-xalan-pom- \
osgi-org.apache.xalan \
osgi-org.apache.xml.serializer \
xalan-j2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.apache.xerces \
xerces-j2"

inherit rpm
