SUMMARY = "Introspection bindings for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "typelib-1_0-GtkSource-3_0-3.24.11-6.8.aarch64.rpm"
RPM_HASH = "5af2d3a9383bd100212ad9f84e8875e2d811c237a775767edd61b1619fed4ff75fe2053103d56e405596c28b9ba4a47eb6e43e083399011dafe6caa2a272339e"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-3-0 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-3.0.so.1 \
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
