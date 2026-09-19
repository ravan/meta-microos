SUMMARY = "X11 video Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xv0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "d0e10c357ccd93def5df5aa95de8c8ce7210fb87b1b5f10bcc75589b693f951eb1d3a632ee5ac6deab11c6205d5e32e851a8d7f7e6ffdc6e6f9f0512e27fdc6f"

RPROVIDES:${PN} += "libxcb-xv.so.0 \
libxcb-xv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
