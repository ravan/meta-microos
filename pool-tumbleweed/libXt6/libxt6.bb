SUMMARY = "X Toolkit Intrinsics library"
DESCRIPTION = "The low level Xlib library provides functions for interacting with an \
X11 server, but does not provide any function for implementing the \
graphical objects (widgets) used in GUIs, such as buttons, menus, \
etc. The Xt library provides support for creating and using widget \
types, but does not provide any specific widget. Specific widgets are \
implemented by other libraries using Xt, such as Xaw and Motif."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libXt6-1.3.1-3.6.aarch64.rpm"
RPM_HASH = "61b1e469884f9ec06179bffa7bc18dfe6c9d2cb898509744e2d0460ff431430529d605c1fb3b2e98cf951fafa3e549ced52c0fa7a30ebde2e66b58b481822c5f"

RPROVIDES:${PN} += "libXt.so.6 \
libXt6 \
xorg-x11-libXt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libc.so.6"

inherit rpm
