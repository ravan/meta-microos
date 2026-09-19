SUMMARY = "X11 Damage Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-damage0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "f01ee3d6a7fc05dc709ff0ea1a8b53a874a4118bc8d6420e2db63e0aced8030c23c8e62a0a47df9c7d2a5ff20bdf801a33d81bbcb9f762e379d79fc85abc6014"

RPROVIDES:${PN} += "libxcb-damage.so.0 \
libxcb-damage0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
