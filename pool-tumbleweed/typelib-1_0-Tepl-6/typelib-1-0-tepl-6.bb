SUMMARY = "GObject introspection bindings for libtepl"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This package provides the GObject Introspection bindings for tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.14.0"

RPM_NAME = "typelib-1_0-Tepl-6-6.14.0-2.5.aarch64.rpm"
RPM_HASH = "55d2c6d3577ab2df9ef09be638a753a4139a5d0e1e221e9f8657e8216ea8c107e5c94e709b881ec66f5f383f3482bd2689c5db82a9879462e796d2247986b42a"

RPROVIDES:${PN} += "typelib-1-0-Tepl-6 \
typelib-Tepl"

RDEPENDS:${PN} += "libgedit-tepl-6.so.4 \
typelib-Amtk \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
