SUMMARY = "Libyui - REST API plugin, the shared part"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API, it is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-rest-api16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "4142deae2229d9a85e5beeec975c3083fb40e9c346236cf9f547e6c800cf90db42f9e570b1c248a9f2c479be95ce4e68cbe82e2e7037a1cf3d3bb100eeb64c2e"

RPROVIDES:${PN} += "libyui-rest-api \
libyui-rest-api.so.16 \
libyui-rest-api16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libmicrohttpd.so.12 \
libstdc++.so.6 \
libyui.so.16 \
libyui16 \
yui-backend"

inherit rpm
