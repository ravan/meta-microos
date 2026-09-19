SUMMARY = "Introspection bindings for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the GObject Introspection bindings for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "typelib-1_0-Gspell-1-1.14.4-2.1.aarch64.rpm"
RPM_HASH = "83394fe44356533f2a1893b05f93e02ec6a2986a985881927268d80e319943d151f82d8e22bc0788a3e095392dfea362ed66a0aa5939e7d5b227b21927527a5f"

RPROVIDES:${PN} += "typelib-1-0-Gspell-1 \
typelib-Gspell"

RDEPENDS:${PN} += "libgspell-1.so.3 \
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
