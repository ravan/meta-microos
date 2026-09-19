SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.47.0"

RPM_NAME = "libgxw0-0.47.0-2.3.aarch64.rpm"
RPM_HASH = "c5fcd802e1a8d099ea2a63e2c221d44906d51568ef68427ad786ae2560ec939fc4232a5ddfd3ec6dc6ee1a124886481a29adca47dbcccd920bc3faf53cdc50ef"

RPROVIDES:${PN} += "libgxw.so.0 \
libgxw0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
