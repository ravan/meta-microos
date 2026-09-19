SUMMARY = "Demos for jdom"
DESCRIPTION = "Demonstrations and samples for jdom."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-demo-1.1.3-42.9.noarch.rpm"
RPM_HASH = "125e75ec7d00bfbbfb80d5e87607b0f960511f7cdb3878e548531d81a79e9bd141df90f6fb1a238eb122b7bbccd81574e2f53e88cc736a54c616258f972ad28d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom-demo"

RDEPENDS:${PN} += "jdom"

inherit rpm
