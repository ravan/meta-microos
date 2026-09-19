SUMMARY = "GTK+ Source Editing Widget -- Introspection bindings"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "typelib-1_0-GtkSource-4-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "e57e11ce7091b3a954b6d998758378c2d78e0be791c929ceb27f276ad9068fca32931c1e032f22e06976a098f6ca2a8a34d4562cd3cb0f7846b4e620d54163ee"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-4 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-4.so.0 \
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
