SUMMARY = "Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "typelib-1_0-Ido3-0_1-13.10.0+bzr20161028-4.10.aarch64.rpm"
RPM_HASH = "b90c83c955cd60755825c68624c4c5e5057a4cfa002d19731efb0a4a579e6fafce62e5620860208db55ecc0027685ca256b986e6a48c544688e44f16569a762e"

RPROVIDES:${PN} += "typelib-1-0-Ido3-0-1 \
typelib-Ido3"

RDEPENDS:${PN} += "libido3-0.1.so.0 \
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
