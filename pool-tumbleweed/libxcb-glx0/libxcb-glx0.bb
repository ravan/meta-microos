SUMMARY = "X11 GLX Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-glx0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "74eb43b7d35da679989597ce0705905834b6e8a89a74212ee73641c4b6b8e4b586a73a602540634ba4d43baee9f0a7ff22e41e75cedcf40fd3b7855537ac5aa6"

RPROVIDES:${PN} += "libxcb-glx.so.0 \
libxcb-glx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
