SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA-1_0-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "fb4431338ebcece483fa13396361d3eedd2f0729c79035427da3442867d1a60e0c87f29a228e8b83b8ad605853a7ee7b5e2e14288fb5eb0a7e04188bc506927d"

RPROVIDES:${PN} += "typelib-1-0-NMA-1-0 \
typelib-NMA"

RDEPENDS:${PN} += "libnma.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-NM \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
