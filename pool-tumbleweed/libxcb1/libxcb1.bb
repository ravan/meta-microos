SUMMARY = "X11 core protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb1-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "e067c3e06936998891f808851f4cf6c5fcff5b564b0777a9ded0059b97949629c1c9f45402820e2ed868363d83ba66ebb08748abebe27e48bb84fd0fe77b323c"

RPROVIDES:${PN} += "libxcb.so.1 \
libxcb1 \
xorg-x11-libxcb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6"

inherit rpm
