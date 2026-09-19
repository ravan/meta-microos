SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-devel-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "e1f8a5cde6003060d300d14e27eff5c586bf9db23d1c3fe9d5c4ae618adb38817cb34edd34655374485366c5858afd93db1dc71245eb1c24e63dc5e3c0993fac"

RPROVIDES:${PN} += "libtolua++-5-3-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.3"

inherit rpm
