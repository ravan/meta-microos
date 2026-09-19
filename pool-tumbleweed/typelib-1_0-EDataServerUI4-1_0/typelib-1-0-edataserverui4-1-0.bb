SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EDataServerUI4-1_0-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "310afc093c10aaecf521fb9c1565147bb734ae86ea3af14e5e7e14e8cc60484ac7480a80b1082237960323f56eb61f856995faded4af148e40145fb74cd6ace4"

RPROVIDES:${PN} += "typelib-1-0-EDataServerUI4-1-0 \
typelib-EDataServerUI4"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedataserverui4-1.0.so.0 \
typelib-Camel \
typelib-ECal \
typelib-EDataServer \
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
typelib-ICalGLib \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2"

inherit rpm
