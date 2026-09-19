SUMMARY = "X11 DRI2 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-dri2-0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "a324612f02b2c8b2b55e8176f6d95406c5483c1f66a5218a62469521470edfe5d4c6094ecd7b1d072f1cc1cec31f26362e94e6a6ae9ffa7477685ff71158c684"

RPROVIDES:${PN} += "libxcb-dri2-0 \
libxcb-dri2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
