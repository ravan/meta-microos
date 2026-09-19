SUMMARY = "Apache XML Stylebook"
DESCRIPTION = "Apache XML Stylebook is a HTML documentation generator."
LICENSE = "Apache-1.1"

PV = "1.0~b3_xalan2"

RPM_NAME = "xml-stylebook-1.0~b3_xalan2-1.8.noarch.rpm"
RPM_HASH = "12a443cc2631cd4b2ff3c8219eddd2cd769b308cbdcbe064ba1a241b6caebee1c5aed0a570b636f6aa1d25593a579913e05dbed432bd2fd62d1bfba7643910db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-stylebook"

RDEPENDS:${PN} += "xerces-j2 \
xml-apis"

inherit rpm
