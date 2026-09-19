SUMMARY = "File Browser for Cinnamon -- Introspection Bindings"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the GObject Introspection bindings for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "typelib-1_0-Nemo-3_0-6.6.4-1.1.aarch64.rpm"
RPM_HASH = "e24f91cf7f6a07013b797c1e3cc06e2c790899fe81df391a52b068d062833b9c841062f4530a75337d71c45583053560254da559171c1ac903978a6702c34c3a"

RPROVIDES:${PN} += "typelib-1-0-Nemo-3-0 \
typelib-Nemo"

RDEPENDS:${PN} += "libnemo-extension.so.1 \
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
