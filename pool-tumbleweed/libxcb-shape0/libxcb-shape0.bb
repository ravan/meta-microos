SUMMARY = "X11 Shape Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
In the X Window System, the X Nonrectangular Window Shape Extension (Xshape) \
allows windows to be given arbitrary, non-rectangular shapes."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-shape0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "69cef5f0963fd102111989cc6f0134ef51b196d76226ba6daf4726be68f942f0ef988a9a14715e348ce0278d4108298ca2527556a88dcef4b8540f0783a893fb"

RPROVIDES:${PN} += "libxcb-shape.so.0 \
libxcb-shape0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
