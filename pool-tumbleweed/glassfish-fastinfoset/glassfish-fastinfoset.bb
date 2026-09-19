SUMMARY = "Fast Infoset"
DESCRIPTION = "Fast Infoset specifies a standardized binary encoding for the XML Information \
Set. An XML infoset (such as a DOM tree, StAX events or SAX events in \
programmatic representations) may be serialized to an XML 1.x document or, as \
specified by the Fast Infoset standard, may be serialized to a fast infoset \
document.  Fast infoset documents are generally smaller in size and faster to \
parse and serialize than equivalent XML documents."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-1.2.15-9.4.noarch.rpm"
RPM_HASH = "7852d1a0cc9af60428774a43e46d3356910b73017b4a9b0ee99fb879ef2dcb291d5a54431687a34628672a1f7a391b960f9f2fc719bb2609d8c46f74cf7796fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset \
mvn-com.sun.xml.fastinfoset-FastInfoset \
mvn-com.sun.xml.fastinfoset-FastInfoset-pom- \
mvn-com.sun.xml.fastinfoset-FastInfosetUtilities \
mvn-com.sun.xml.fastinfoset-FastInfosetUtilities-pom- \
mvn-com.sun.xml.fastinfoset-fastinfoset-project-pom- \
osgi-com.sun.xml.fastinfoset.FastInfoset"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.stream.buffer-streambuffer \
mvn-com.sun.xsom-xsom \
xmlstreambuffer"

inherit rpm
