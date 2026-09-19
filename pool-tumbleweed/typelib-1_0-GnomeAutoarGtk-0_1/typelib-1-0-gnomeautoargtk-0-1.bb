SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "typelib-1_0-GnomeAutoarGtk-0_1-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "9a9766e74bd2fb22c4a30aa1b063832ebbaf56d3d4c5eb7f07bb406edb6156ed2724e3639334eff5be6a31888ad79427c3e1606bdf6ccc0fe504ba0d7320d6e0"

RPROVIDES:${PN} += "typelib-1-0-GnomeAutoarGtk-0-1 \
typelib-GnomeAutoarGtk"

RDEPENDS:${PN} += "libgnome-autoar-gtk-0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeAutoar \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
