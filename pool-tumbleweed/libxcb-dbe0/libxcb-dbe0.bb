SUMMARY = "X11 Dbe Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-dbe0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "8730d64b89f3c86f811a4f0bfcd7a2fbbb03eb2f5871e158ea8aad68e3641f451661f1aa7630bab117b9d20ea9c881a2c9402438559a29345cc4f0d95f3be46d"

RPROVIDES:${PN} += "libxcb-dbe.so.0 \
libxcb-dbe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
