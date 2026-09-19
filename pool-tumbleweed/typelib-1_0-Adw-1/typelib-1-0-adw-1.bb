SUMMARY = "Introspection bindings for Adwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the GObject Introspection bindings for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.3"

RPM_NAME = "typelib-1_0-Adw-1-1.9.3-1.1.aarch64.rpm"
RPM_HASH = "a4c5771125f2348f08c9754bb081629aae670ee85a2a5b126edfd29ac11cee55af838e7ae227e63810c23c17b7edcda6e0e418236f1a01c44356df8806b40595"

RPROVIDES:${PN} += "typelib-1-0-Adw-1 \
typelib-Adw"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
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
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
