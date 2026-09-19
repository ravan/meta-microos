SUMMARY = "Open Source XML framework for Java"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "Plexus"

PV = "2.1.5"

RPM_NAME = "dom4j-bootstrap-2.1.5-1.4.noarch.rpm"
RPM_HASH = "328251edaaab6753d90257097b0f099f8a0c567a9510c6a2c639e0088879f3b2cd908f23400f9de7a168243d389ddbb477bd5d3a550a610844f8e6f6262476fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-bootstrap"

RDEPENDS:${PN} += ""

inherit rpm
