SUMMARY = "Introspection bindings for the Papers Document Viewer"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "typelib-1_0-PapersDocument-4_0-50.3-1.1.aarch64.rpm"
RPM_HASH = "78a12aa096705942cbef3f4a2f909e195b950d85ea8f0e21435f4c9a04b1352e79db5660842073d65e043de1dddb6d548e415c8571fa64707f41473e9bbaf053"

RPROVIDES:${PN} += "typelib-1-0-PapersDocument-4-0 \
typelib-PapersDocument"

RDEPENDS:${PN} += "libppsdocument-4.0.so.6 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
