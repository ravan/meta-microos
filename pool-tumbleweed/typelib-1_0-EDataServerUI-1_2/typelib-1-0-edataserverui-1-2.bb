SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EDataServerUI-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "e9372d31fbf410057ce0115d4684f50b5220fdd20c7fefeceecccdc429131c2149e54573c717e7358589d8d91529d3d37a8aa9059ec7edaf0c50b20919556613"

RPROVIDES:${PN} += "typelib-1-0-EDataServerUI-1-2 \
typelib-EDataServerUI"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
typelib-Atk \
typelib-Camel \
typelib-ECal \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-ICalGLib \
typelib-Json \
typelib-Pango \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
