SUMMARY = "X11 Composite Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The Composite extension causes a entire sub-tree of the window \
hierarchy to be rendered to an off-screen buffer. Applications can \
then take the contents of that buffer and do whatever they like. The \
off-screen buffer can be automatically merged into the parent window \
or merged by external programs, called compositing managers."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-composite0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "74ad77eb5a2dead486d616e04a3a90715a28b528e3d531aac8b20ac8a4eb477418a122913d1090037a77790ebe68e1ee4f75b2d6683130a60d43a8bb49465bc2"

RPROVIDES:${PN} += "libxcb-composite.so.0 \
libxcb-composite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
