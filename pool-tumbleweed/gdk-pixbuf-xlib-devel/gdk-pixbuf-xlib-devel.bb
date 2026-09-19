SUMMARY = "Development files for gdk-pixbuf-xlib"
DESCRIPTION = "This package contains the development files for gdk-pixbuf-xlib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.40.2"

RPM_NAME = "gdk-pixbuf-xlib-devel-2.40.2-1.21.aarch64.rpm"
RPM_HASH = "efee296b02c8a08f569a9e7899a781a0497b0533e31b1ae6448188f37dc8e5fefaaa66c20e485b22c213c69afd9bc6b71d66a9355362b6589d93694e1f02a541"

RPROVIDES:${PN} += "gdk-pixbuf-xlib-devel \
pkgconfig-gdk-pixbuf-xlib-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdk-pixbuf-xlib-2-0-0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-x11"

inherit rpm
