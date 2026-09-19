SUMMARY = "X11 DRI3 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-dri3-0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "8c31607f0a85715c1f9185e10ffd11dc24f4085e21fb7e8d6330fb8a2ca59b720739f50523a907cd522a7bd51e81abe582153856122820f5290dc644636d5a40"

RPROVIDES:${PN} += "libxcb-dri3-0 \
libxcb-dri3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
