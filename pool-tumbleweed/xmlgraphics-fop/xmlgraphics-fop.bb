SUMMARY = "Formatter for Printing XSLT Processed XML Files"
DESCRIPTION = "FOP (Formatting Objects Processor) is driven by XSL formatting objects \
(XSL-FO). It is a Java application that reads a formatting object (FO) \
tree and renders the resulting pages to one of the following output \
formats: PDF (primary output target), PCL, PS, SVG, XML (area tree \
representation), Print, AWT, MIF, and TXT."
LICENSE = "Apache-2.0"

PV = "2.10"

RPM_NAME = "xmlgraphics-fop-2.10-3.5.noarch.rpm"
RPM_HASH = "4c67eb6fc1d3643f3fe6f91cb0290eca8c3625ac8749d5d68a7e4805cd260ff9ee1c0f4e51159e8129c564273a67e8a23aef1d1d7adbad3d129f8bc88ceecc13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xmlgraphics-fop \
fo-formatter \
fop \
mvn-org.apache.xmlgraphics-fop \
mvn-org.apache.xmlgraphics-fop-pom- \
xmlgraphics-fop"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging \
mvn-javax.servlet-servlet-api \
mvn-org.apache.pdfbox-fontbox \
mvn-org.apache.xmlgraphics-batik-anim \
mvn-org.apache.xmlgraphics-batik-awt-util \
mvn-org.apache.xmlgraphics-batik-bridge \
mvn-org.apache.xmlgraphics-batik-extension \
mvn-org.apache.xmlgraphics-batik-gvt \
mvn-org.apache.xmlgraphics-batik-transcoder \
mvn-org.apache.xmlgraphics-xmlgraphics-commons \
xml-commons-apis"

inherit rpm
