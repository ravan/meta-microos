SUMMARY = "Qt 6 CoAP Client Library"
DESCRIPTION = "Qt 6 library to implement a CoAP client."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Coap6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "84e71835ce179577f7ebf6d09f15427ddd58022ecbbed5e5304dc64de6f5a967527e37be2e8e184cb53ab365a5f7c3f69b66749fd450215afd111619ab21e6b6"

RPROVIDES:${PN} += "libQt6Coap.so.6 \
libQt6Coap6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
