SUMMARY = "Introspection bindings for libglycin-gtk4"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "typelib-1_0-GlyGtk-2-2.1.5-1.2.aarch64.rpm"
RPM_HASH = "31fc0f4a8b0fa5894a22434f644e519aa2259b600c63bfb84bf2e57dd2f4a03f971e023443968e82599abeb618f06af3a885d4c2760ae7fbdfe3cdf971875a3d"

RPROVIDES:${PN} += "typelib-1-0-GlyGtk-2 \
typelib-GlyGtk4"

RDEPENDS:${PN} += "libglycin-gtk4-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gly \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
