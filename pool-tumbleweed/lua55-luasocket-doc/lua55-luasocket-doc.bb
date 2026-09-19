SUMMARY = "Documentation for lua55-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua55-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua55-luasocket-doc-3.1.0-5.3.noarch.rpm"
RPM_HASH = "f265d662895d7085e58267e4c87176a30635c5830032d685632c9bd8df8e04561d6decbc4d5c48a74483a75da2f8bd2c541af38432956672137c6c92e7093b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luasocket-doc"

RDEPENDS:${PN} += ""

inherit rpm
