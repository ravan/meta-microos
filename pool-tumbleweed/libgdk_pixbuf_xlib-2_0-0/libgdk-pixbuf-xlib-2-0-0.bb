SUMMARY = "An GdkPixbuf compat library"
DESCRIPTION = "gdk-pixbuf-xlib is an image loading library that can be extended by \
loadable modules for new image formats. It is used by toolkits such \
as GTK+ or Clutter. \
 \
This package is a compat package providing various functions to \
integrate GdkPixbuf with Xlib data types"
LICENSE = "LGPL-2.1-or-later"

PV = "2.40.2"

RPM_NAME = "libgdk_pixbuf_xlib-2_0-0-2.40.2-1.21.aarch64.rpm"
RPM_HASH = "de4d0f6debb919a57d80015ca07b6e1cea56e6e8fc3994e5159ef22391a2b1c716f3d592de4e7a55ed24220e830b7d9f99892c36a581a6774c8aa837fff74894"

RPROVIDES:${PN} += "libgdk-pixbuf-xlib-2-0-0 \
libgdk-pixbuf-xlib-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
