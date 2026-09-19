SUMMARY = "Introspection bindings for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "typelib-1_0-Gtk-4_0-4.22.5-1.1.aarch64.rpm"
RPM_HASH = "c0cc947e45fa4ae6ffea7ac2f3727c3ef2e0dc151ec31d1afe87151babf04a389fd8c2a87eb9a7b5372472e9d5c643976be92ad4c39186b0178a0a28013faa48"

RPROVIDES:${PN} += "typelib-1-0-Gtk-4-0 \
typelib-Gdk \
typelib-GdkWayland \
typelib-GdkX11 \
typelib-Gsk \
typelib-Gtk"

RDEPENDS:${PN} += "libgtk-4.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
