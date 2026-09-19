SUMMARY = "Examples for rhino"
DESCRIPTION = "Examples for rhino"
LICENSE = "MPL-2.0"

PV = "1.7.15.1"

RPM_NAME = "rhino-demo-1.7.15.1-1.5.noarch.rpm"
RPM_HASH = "9f2eeef37976c2e0538585f0e81ff822a1c72eb2ea9eb1717d5cf13646d5fefd00e797d2e0c640e5c12ef3a6d1f964de592fd76e8dd67332ed9d3b8ce0f23af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-demo"

RDEPENDS:${PN} += ""

inherit rpm
