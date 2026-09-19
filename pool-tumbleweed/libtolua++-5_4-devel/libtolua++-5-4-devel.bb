SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-devel-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "a3fa1048c7f531aa6f7df6b87276e4fcd050875ef8020c0b7e69321482a7d814dcb4fe03a5ae16606155596c9b96b1ee71fbd495f97618de69d45059b6954988"

RPROVIDES:${PN} += "libtolua++-5-4-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.4"

inherit rpm
