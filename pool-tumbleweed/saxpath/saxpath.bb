SUMMARY = "Simple API for XPath"
DESCRIPTION = "The SAXPath project is a Simple API for XPath. SAXPath is analogous to SAX \
in that the API abstracts away the details of parsing and provides a simple \
event based callback interface."
LICENSE = "Saxpath"

PV = "1.0"

RPM_NAME = "saxpath-1.0-2.8.noarch.rpm"
RPM_HASH = "30ff09d67dc336c960d457463cf3d4c8ca528f6506acbdb1676330999f0b7f528031c4361cd56e47dc7586a24eea1104e892f98e4da51885e15cb4a08ca2f4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxpath-saxpath \
mvn-saxpath-saxpath-pom- \
saxpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jpackage-utils"

inherit rpm
