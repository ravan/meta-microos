SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-devel-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "fc34b2c23a1c033a50cf7c55475a71890fa3db0ce31e8b2c3cf5ca2f130df7f84677984c55b7198a3d360902b806a1c8a984ce1f11f7ae7f66eb51ef0daa3339"

RPROVIDES:${PN} += "libtolua++-5-1-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.1"

inherit rpm
