SUMMARY = "Open Source XML framework for Java - demo"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "Plexus"

PV = "2.1.5"

RPM_NAME = "dom4j-demo-2.1.5-1.3.noarch.rpm"
RPM_HASH = "d3921f0c5b810faa1abbc17e66aaab843f400e7ac6301ff4b8d36f3ad3881d255244c98434eb40025cb1658e856c6820bc95dba3b711bc1dc6d009f4ca50e9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-demo"

RDEPENDS:${PN} += "dom4j"

inherit rpm
