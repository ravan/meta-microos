SUMMARY = "Introspection bindings for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "typelib-1_0-Gtk-2_0-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "e0b20154208f796395c7bf446d94c938bcb38bad08562d961243f265b2b9efcd102887fac333b6908845590e65c03a42e551465d3f0c547f0929862982e9788e"

RPROVIDES:${PN} += "typelib-1-0-Gtk-2-0 \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gtk"

RDEPENDS:${PN} += "libgdk-x11-2.0.so.0 \
libgtk-x11-2.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
