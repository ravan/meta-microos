SUMMARY = "RT Topology Library"
DESCRIPTION = "The RT Topology Library exposes an API to create and manage standard \
(ISO 13249 aka SQL/MM) topologies using user-provided [data stores]"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo1-1.1.0-3.9.aarch64.rpm"
RPM_HASH = "36a2b016e7b8dfc66931ebe958292e45b1df0b09e1fc21b8846c05cd2de7b734662880099b2f237c614650f1e3e03c12709f3b7da86f0b65bc43ba51cd8031f0"

RPROVIDES:${PN} += "librttopo.so.1 \
librttopo1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libm.so.6"

inherit rpm
