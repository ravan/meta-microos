SUMMARY = "X11 Present Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-present0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "076488722013cf2d311e0b7dd08eae52782cedbb6c4488696f4e8a2a0284f838ffefa91fd0aea3a080e47dbea18eb2f9127de7b8d8404b560d875f7db09cc607"

RPROVIDES:${PN} += "libxcb-present.so.0 \
libxcb-present0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
