SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA4-1_0-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "5950e348d2fff7d5f209c386d1eee66249e96785f387262cbd1d8ba7a9ffedd19500a339bdf19fcf9a6880d5ad265e8139b7d342927e263c6d851765fc2c09e3"

RPROVIDES:${PN} += "typelib-1-0-NMA4-1-0 \
typelib-NMA4"

RDEPENDS:${PN} += "libnma-gtk4.so.0 \
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
typelib-NM \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
