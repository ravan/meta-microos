SUMMARY = "Main library for twin"
DESCRIPTION = "Main library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+161"

RPM_NAME = "libtw1-0.9.0+161-1.5.aarch64.rpm"
RPM_HASH = "bc4de12ea4eec926d953ac32d2b67de225222202d1418e31b190445102ffb562733f570adad7c971d8874b3175e9bb65de9fb06e428d4a5d5cfe4476ea8956e9"

RPROVIDES:${PN} += "libTw5 \
libtw.so.1 \
libtw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
