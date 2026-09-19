SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "typelib-1_0-GooCanvas-2_0-2.0.4-5.6.aarch64.rpm"
RPM_HASH = "6cd8fd54f7195286940db928ea41f9ebc53e41c838b16962665f981f1d4df57a0df444ed1b8e156339901ed5f39a53cb0a1fceeabc96c96156379dbac05eec30"

RPROVIDES:${PN} += "typelib-1-0-GooCanvas-2-0 \
typelib-GooCanvas"

RDEPENDS:${PN} += "libgoocanvas-2.0.so.9 \
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
