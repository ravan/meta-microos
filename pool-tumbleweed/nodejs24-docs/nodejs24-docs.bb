SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "24.18.1"

RPM_NAME = "nodejs24-docs-24.18.1-1.1.noarch.rpm"
RPM_HASH = "1ec110bee9eabe7b5aecf3d14d742e696a8ee98e47967bfcf4ee5a269e776952ce3223d3a085cfeb1f275f4fd436def2f9e955dafc741407b576b127e92e0b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs24-docs"

RDEPENDS:${PN} += ""

inherit rpm
