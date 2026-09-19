SUMMARY = "GTK+ 2 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 2 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "0e40e8c7d8dd51fe650aaf4993e21a8a7ff98636d9558d10a8c6e5059df6a64adea4cc0b36177e142db2d7c518cea00fd138cbf411bf24860776ccf3bdcd2e09"

RPROVIDES:${PN} += "libdbusmenu-gtk.so.4 \
libdbusmenu-gtk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gtk2 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
