SUMMARY = "X11 XFree86-DRI Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xf86dri0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "800bb09c4bd7628c37c8499832af254aa2aa5c8aaffe7128142e3c7c481a04cb3d6b0e5b1291bc26d720684269cd59f9b6dfccfc5cd1b5aa69bf9721b6e86254"

RPROVIDES:${PN} += "libxcb-xf86dri.so.0 \
libxcb-xf86dri0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
