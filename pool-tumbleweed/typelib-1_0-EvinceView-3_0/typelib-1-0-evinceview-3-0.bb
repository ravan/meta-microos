SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "typelib-1_0-EvinceView-3_0-48.4-2.1.aarch64.rpm"
RPM_HASH = "988a79f546d192b3802ac7be2b9375611dc69807c7f36106d9ef7e8aeda3bf514408ddc9b82f80d4f05b4554025e5e595a46cd906d3bfc890cc1b91c5bf81663"

RPROVIDES:${PN} += "typelib-1-0-EvinceView-3-0 \
typelib-EvinceView"

RDEPENDS:${PN} += "libevdocument3.so.4 \
libevview3.so.3 \
typelib-Atk \
typelib-EvinceDocument \
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
