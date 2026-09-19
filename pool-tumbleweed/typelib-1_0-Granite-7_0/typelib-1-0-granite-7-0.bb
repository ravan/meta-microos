SUMMARY = "Introspection bindings for the Granite development library"
DESCRIPTION = "This package provides the GObject Introspection bindings for libgranite."
LICENSE = "LGPL-3.0-or-later"

PV = "7.8.1"

RPM_NAME = "typelib-1_0-Granite-7_0-7.8.1-1.3.aarch64.rpm"
RPM_HASH = "f82b7885ca0fc032a6dbaf7e5f6cc946c5b76b191f144797d00e1cea5dcab74a8447bc0bda0a392609225cd75efad3e9e918cea7797bc4a1c3875bb37a1a24f4"

RPROVIDES:${PN} += "typelib-1-0-Granite-7-0 \
typelib-Granite"

RDEPENDS:${PN} += "libgranite-7.so.7 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
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
