SUMMARY = "Muffin Introspection bindings"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the GObject Introspection bindings for muffin."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "typelib-1_0-Muffin-0_0-6.4.1-2.4.aarch64.rpm"
RPM_HASH = "ccc9df2325f1adcea458c074119d7b481edb44f240394522f05e56f9f5801c8b0eaf714ef8cd8272db1068e4b40cf620b5cf724fb9b6916fd90773067c0c3f3c"

RPROVIDES:${PN} += "typelib-1-0-Muffin-0-0 \
typelib-Cally \
typelib-Clutter \
typelib-ClutterX11 \
typelib-Cogl \
typelib-CoglPango \
typelib-Meta"

RDEPENDS:${PN} += "libmuffin-clutter-0.so.0 \
libmuffin-cogl-0.so.0 \
libmuffin-cogl-pango-0.so.0 \
libmuffin.so.0 \
typelib-Atk \
typelib-CDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
