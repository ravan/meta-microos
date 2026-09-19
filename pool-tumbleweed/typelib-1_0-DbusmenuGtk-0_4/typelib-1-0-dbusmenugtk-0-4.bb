SUMMARY = "Introspection bindings for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 2 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk-0_4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "afbc028fa26f2c8e2550cbf25a2adad5cc9794b70a67fdc2532500ecd926c6b814ad076c40949fa6789b86a1043d76c469dae60ad9124d3d9d644bfc4af9f9ce"

RPROVIDES:${PN} += "typelib-1-0-DbusmenuGtk-0-4 \
typelib-DbusmenuGtk"

RDEPENDS:${PN} += "libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
typelib-Atk \
typelib-Dbusmenu \
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
typelib-freetype2"

inherit rpm
