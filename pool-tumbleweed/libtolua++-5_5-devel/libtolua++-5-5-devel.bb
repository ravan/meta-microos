SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_5-devel-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "a95fa8187d4563482db9a8c0c9dcd8b8fad6a80cc6dad5f4977dbfb885638fac9e176994fd98e19aa60a55d2e9cb2b5420e1fe4efad98ddbe55b5939b1733d75"

RPROVIDES:${PN} += "libtolua++-5-5-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.5"

inherit rpm
