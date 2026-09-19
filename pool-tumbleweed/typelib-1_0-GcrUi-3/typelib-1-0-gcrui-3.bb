SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "typelib-1_0-GcrUi-3-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "1558a3e5d86c16c41b1f05150969609939d4ef84329a03303ec05f3b3e776daffaf07c3a0db38109704d581ecea3b2061cbdfca9672db6e494b6397ebe4448d8"

RPROVIDES:${PN} += "typelib-1-0-GcrUi-3 \
typelib-GcrUi"

RDEPENDS:${PN} += "libgcr-ui-3.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gck \
typelib-Gcr \
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
