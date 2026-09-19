SUMMARY = "Glade catalog for libhandy"
DESCRIPTION = "libhandy is a library to help with developing UI for mobile devices \
using GTK+/GNOME. \
 \
This package provides a catalog for libhandy, to allow the use \
libhandy widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "glade-catalog-libhandy-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "6b24898b2305b0459a066e73ef78d28a511b2966fdb26b41aebfeaa7ea387b74d6c28b577f7262c1ccc8c30e17a732be900848da7964ea141cdaea0597f7d8ad"

RPROVIDES:${PN} += "glade-catalog-libhandy \
libglade-handy-1.so"

RDEPENDS:${PN} += "glade \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libm.so.6"

inherit rpm
