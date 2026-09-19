SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "typelib-1_0-GPasteGtk-4-50.9-1.1.aarch64.rpm"
RPM_HASH = "ea800202e9aa4c79f48e4722bd509b086be7da510b2192e3780c1bfe77bc7909222e49fab54911c397c9aae991a3cf91eede8fb481c3bf89d27a51429c07feda"

RPROVIDES:${PN} += "typelib-1-0-GPasteGtk-4 \
typelib-GPasteGtk"

RDEPENDS:${PN} += "libgpaste-gtk4.so.1 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GPaste \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
