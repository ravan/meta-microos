SUMMARY = "A Featureful Unicode Character Map -- Introspection bindings"
DESCRIPTION = "Gucharmap is a featureful unicode character map. \
 \
This package provides the GObject Introspection bindings for the \
gucharmap library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "17.0.2"

RPM_NAME = "typelib-1_0-Gucharmap-2_90-17.0.2-1.4.aarch64.rpm"
RPM_HASH = "ab47cf42e5128db5ca9f5cc5ec4e8162321ecab921088218f2b9d20a503a197a464edfe4b0d909a34c78bc2935bcc294dc164e1d12285177392e6ab2017f096e"

RPROVIDES:${PN} += "typelib-1-0-Gucharmap-2-90 \
typelib-Gucharmap"

RDEPENDS:${PN} += "libgucharmap-2-90.so.7 \
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
