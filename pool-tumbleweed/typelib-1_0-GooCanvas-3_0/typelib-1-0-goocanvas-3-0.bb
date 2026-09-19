SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "typelib-1_0-GooCanvas-3_0-3.0.0-5.6.aarch64.rpm"
RPM_HASH = "2a69b30237f7444241ca4379ff0c9ac4f083245da8eb01fc586c250b0664ad459d28ce882fbd2e0ac87f2328b38b52b5c431f9a0f73bea6fce9ce2e8a94ea03e"

RPROVIDES:${PN} += "typelib-1-0-GooCanvas-3-0 \
typelib-GooCanvas"

RDEPENDS:${PN} += "libgoocanvas-3.0.so.9 \
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
