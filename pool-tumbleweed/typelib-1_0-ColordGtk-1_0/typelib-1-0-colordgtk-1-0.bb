SUMMARY = "GTK Integration Introspection bindings for colord-gtk"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "typelib-1_0-ColordGtk-1_0-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "dfa0d0d19c2c9a6e76a6344abff0349aee102e5d3beb1307677399c3d20e9de09e719f782b2f746c6f5b3f41f229e8a83d8faf5ff75f22b5f9ce806b916aefa2"

RPROVIDES:${PN} += "typelib-1-0-ColordGtk-1-0 \
typelib-ColordGtk"

RDEPENDS:${PN} += "libcolord-gtk.so.1 \
typelib-Atk \
typelib-Colord \
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
