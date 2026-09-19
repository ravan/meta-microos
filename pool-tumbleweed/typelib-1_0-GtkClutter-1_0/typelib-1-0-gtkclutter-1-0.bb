SUMMARY = "Introspection bindings for the GTK+ Clutter integration"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter. \
 \
This package provides the GObject Introspection bindings for Clutter \
GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "typelib-1_0-GtkClutter-1_0-1.8.4-5.30.aarch64.rpm"
RPM_HASH = "8467c8856e544637fbc75f6421a6ab8d53cd9c63a731311bddf2f978c9dec8c9f8f60849b974a6de27610e386a44be88ae69bd662e93413473594716b14f288c"

RPROVIDES:${PN} += "typelib-1-0-GtkClutter-1-0 \
typelib-GtkClutter"

RDEPENDS:${PN} += "libclutter-gtk-1.0.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
