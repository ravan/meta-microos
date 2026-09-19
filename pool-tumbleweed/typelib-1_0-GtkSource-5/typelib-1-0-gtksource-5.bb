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

PV = "5.20.0"

RPM_NAME = "typelib-1_0-GtkSource-5-5.20.0-2.1.aarch64.rpm"
RPM_HASH = "914c37dcff0187a301bc6778305cb4f3550a1bd30ec6606c2f09247f2d8c09619e7dec12c303a03f71b2d2cba2ddfbb2d17588b4503a074c61f4c29788d83b6d"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-5 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-5.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
