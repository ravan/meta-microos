SUMMARY = "API documentation for json-simple"
DESCRIPTION = "This package contains API documentation for json-simple."
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "json-simple-javadoc-2.3.1-2.4.noarch.rpm"
RPM_HASH = "386bdf8b8fdfbe33aaad307ac5e14230701520f059d476d6be47d2c34c882bd392cb2f3d67101fc3ada829c81d466dac94136d3e7bc80cfc7dc6e48d52c3eb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-simple-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
