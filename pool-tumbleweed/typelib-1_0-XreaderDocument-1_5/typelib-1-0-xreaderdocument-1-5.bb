SUMMARY = "XReaderDocument -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "typelib-1_0-XreaderDocument-1_5-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "e79e7aa92c84282790de5d6650ad5d87d0aa6ddc2d1b9331043542e1b760ee3cba90b942bc52490df51037f48a8d3e028b2d655c5598f57e90b089f1f1eb1b67"

RPROVIDES:${PN} += "typelib-1-0-XreaderDocument-1-5 \
typelib-1-0-XreaderDocument-1-5-0 \
typelib-XreaderDocument"

RDEPENDS:${PN} += "libxreaderdocument.so.3 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
