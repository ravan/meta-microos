SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "typelib-1_0-EvinceDocument-3_0-48.4-2.1.aarch64.rpm"
RPM_HASH = "f56750b4990495d0d2316c57020ba8b88ee673a29296d3e1dfbc2fec9add258342049f85bb36152885a3d1879cb07c2eb500a58147e8f3a61f04afad3edcc8ac"

RPROVIDES:${PN} += "typelib-1-0-EvinceDocument-3-0 \
typelib-EvinceDocument"

RDEPENDS:${PN} += "libevdocument3.so.4 \
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
