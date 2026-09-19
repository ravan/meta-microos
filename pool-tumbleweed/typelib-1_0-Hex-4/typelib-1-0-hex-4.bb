SUMMARY = "Introspection bindings for ghex"
DESCRIPTION = "This package provides introspection bindings for ghex."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "typelib-1_0-Hex-4-50.3-1.1.aarch64.rpm"
RPM_HASH = "041bbb43d14be97f8c1b9e8fb573a301f2af3a3983d0f305f35d3d52a83a9e1366abde812deecb9bdb0d58977348a146f30959df9e6c118fd5b9792920f29834"

RPROVIDES:${PN} += "typelib-1-0-Hex-4 \
typelib-Hex"

RDEPENDS:${PN} += "libgtkhex-4.so.1 \
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
