SUMMARY = "GTK+3 timezone map widget - Introspection bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for \
timezonemap library."
LICENSE = "GPL-3.0-only"

PV = "0.4.6"

RPM_NAME = "typelib-1_0-TimezoneMap-1_0-0.4.6-1.11.aarch64.rpm"
RPM_HASH = "659a03db63f1a1bcb4eb21118d520289816f5c7f633e6a68fecb9b60044d5476085f6862bb231f657b6f91242576b1af3b607959dadc899ede4ee48bf0a43736"

RPROVIDES:${PN} += "typelib-1-0-TimezoneMap-1-0 \
typelib-TimezoneMap"

RDEPENDS:${PN} += "libtimezonemap.so.1 \
typelib-Atk \
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
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
