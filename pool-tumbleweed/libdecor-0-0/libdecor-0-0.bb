SUMMARY = "Library for client-side Wayland decorations"
DESCRIPTION = "A client-side decorations library for Wayland client."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libdecor-0-0-0.2.5-1.6.aarch64.rpm"
RPM_HASH = "a88192ccb243d79452062106690fc6bd09d9e17c28b66f6a4ca29707bbfaf803d6584ea95935fe1be675befb44a382867d67ba55d483b79dbf967a404a3ae2ca"

RPROVIDES:${PN} += "libdecor-0-0 \
libdecor-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdecor \
libwayland-client.so.0"

inherit rpm
