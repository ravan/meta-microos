SUMMARY = "Introspection bindings for gdk-pixdata"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixdata."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44.7"

RPM_NAME = "typelib-1_0-GdkPixdata-2_0-2.44.7-1.2.aarch64.rpm"
RPM_HASH = "749bb8f2473c37305b5d8a14648b83c86fe417e538040958442c6e6470942d807c9dce77091b7a43dcb1f64aa985d570fb66aea064a840b022c07c8d61411c18"

RPROVIDES:${PN} += "typelib-1-0-GdkPixdata-2-0 \
typelib-GdkPixdata"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
