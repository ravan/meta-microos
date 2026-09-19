SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EDataCal-2_0-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "9ba578d00ea28afc352962cb4efd10142944435ceff9cb58ddc2cad5cd7e95a884da130be2d39f7f85489ebd47cef698d6d9e2e7b5197fe3a63d236ab21cfaeb"

RPROVIDES:${PN} += "typelib-1-0-EDataCal-2-0 \
typelib-EDataCal"

RDEPENDS:${PN} += "libebackend-1.2.so.11 \
libecal-2.0.so.3 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBackend \
typelib-ECal \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-ICalGLib \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
