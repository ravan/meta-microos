SUMMARY = "Introspection bindings for the Papers Document Viewer"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "typelib-1_0-PapersView-4_0-50.3-1.1.aarch64.rpm"
RPM_HASH = "cbbe317d42fbb813237743951db6788b2bef4119b175b311930598b47dc463dc63b95c3b6cd89de9bba7ca0cf1253e4d4527dfac207659a34524dfd49b69e877"

RPROVIDES:${PN} += "typelib-1-0-PapersView-4-0 \
typelib-PapersView"

RDEPENDS:${PN} += "libppsdocument-4.0.so.6 \
libppsview-4.0.so.5 \
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
typelib-PapersDocument \
typelib-cairo \
typelib-freetype2"

inherit rpm
