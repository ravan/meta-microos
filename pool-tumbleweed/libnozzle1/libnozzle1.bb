SUMMARY = "Simple userland wrapper around kernel tap devices"
DESCRIPTION = "This is an over-engineered commodity library to manage a pool \
of tap devices and provides the basic \
pre-up.d/up.d/down.d/post-down.d infrastructure."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libnozzle1-1.33-2.2.aarch64.rpm"
RPM_HASH = "54a714becb831e6015feef7ecc14a971e40a88a92106fc8c62ae9ffd40d009850b8eeea82fc8ba352f551c160c44817163cda4ad6e009901ef697f14c933d1a2"

RPROVIDES:${PN} += "libnozzle.so.1 \
libnozzle1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
