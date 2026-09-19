SUMMARY = "Introspection bindings for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.3"

RPM_NAME = "typelib-1_0-Gepub-0_7-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "227f0bbc8a70ffd201331bada575788d63205d3621a4bdd9f125ca8669580795e5dea14581869af546b193cc29008230bdd1acd9f3f87791b9bd7360174e9235"

RPROVIDES:${PN} += "typelib-1-0-Gepub-0-7 \
typelib-Gepub"

RDEPENDS:${PN} += "libgepub-0.7.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
