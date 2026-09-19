SUMMARY = "Demonstration and samples for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains demonstration and sample files for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-demo-2.7.3-4.6.noarch.rpm"
RPM_HASH = "c221f729d58a14cf475c0340017a8fb055a2b4891309d63701ab950a55c7d13177cfbf0eebc4dc18c4d4654856a4a041f74667915d55bbf90b42bf62b49d7299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-demo"

RDEPENDS:${PN} += "servlet \
xalan-j2"

inherit rpm
