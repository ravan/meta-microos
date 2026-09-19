SUMMARY = "libgedit-gtksourceview's GObject introspection bindings"
DESCRIPTION = "The GObject introspection bindings for libgedit-gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "299.7.1"

RPM_NAME = "typelib-1_0-GtkSource-300-299.7.1-1.1.aarch64.rpm"
RPM_HASH = "7c89bc4e3d8eef3b710630fe396c2ae41a351a39721b94d49455edbc3ebbc25113eb7622b594d90192e9c2a22c11167a50cf74121577dcc81aa8c9e4869c7279"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-300 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgedit-gtksourceview-300.so.5 \
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
