SUMMARY = "Introspection bindings for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package provides the GObject Introspection bindings for GOffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.61"

RPM_NAME = "typelib-1_0-GOffice-0_10-0.10.61-1.3.aarch64.rpm"
RPM_HASH = "cb8e18ba5aee2563b37d721ed2d8c4f9a50eee9aeb22ed4670f8dfe9f0b11b26addaa91eccac7fd9fbd66b26aaf0ae5c4f573dbe59fa771d1383f80b06653242"

RPROVIDES:${PN} += "typelib-1-0-GOffice-0-10 \
typelib-GOffice"

RDEPENDS:${PN} += "libgoffice-0.10.so.10 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gsf \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
