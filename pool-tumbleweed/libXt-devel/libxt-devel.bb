SUMMARY = "Development files for the X Toolkit Intrinsics library"
DESCRIPTION = "The low level Xlib library provides functions for interacting with an \
X11 server, but does not provide any function for implementing the \
graphical objects (widgets) used in GUIs, such as buttons, menus, \
etc. The Xt library provides support for creating and using widget \
types, but does not provide any specific widget. Specific widgets are \
implemented by other libraries using Xt, such as Xaw and Motif. \
 \
This package contains the development headers for the library found \
in libXt6."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libXt-devel-1.3.1-3.6.aarch64.rpm"
RPM_HASH = "8ef16a3fadcb34fcc7d5ca25d0cc16c8ca0d2dae943c92f465c01191cf10ec1b3c40f30f1a1366bf207cc7a880420d965455d94ab186100c0b1897f9696fefbb"

RPROVIDES:${PN} += "libXt-devel \
pkgconfig-xt \
xorg-x11-libXt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXt6 \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
