SUMMARY = "X11 Resource Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-res0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "5f3354e69f6707e28c4953dd37fe7d5e01e28cc772741038d59afef0665b4fb0951838c066ec6c9f6c5157413fa9d2472e90d78ba3a4eedbaa364a3aa7707dfa"

RPROVIDES:${PN} += "libxcb-res.so.0 \
libxcb-res0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
