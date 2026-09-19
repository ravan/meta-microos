SUMMARY = "X11 Xinerama Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xinerama0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "62c22bfc8cc69a2df83dfc3c3fd336d870782d598364742eeb09c5558313d2b8f28bd35671a279559dc93a8703af29818fd4bdebf2297a5053df965c75f09278"

RPROVIDES:${PN} += "libxcb-xinerama.so.0 \
libxcb-xinerama0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
