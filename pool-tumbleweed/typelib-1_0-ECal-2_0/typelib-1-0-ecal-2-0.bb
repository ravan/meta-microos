SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-ECal-2_0-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "2dd5f9b2be5fe95fdb8e10edb5a83b02d3b462e0cb3aa9c2da6cd3e6d4ae8dcb0f42730e4cc9daeff30a014d5a25504615c1e722d8935da39241d49f60a681a1"

RPROVIDES:${PN} += "typelib-1-0-ECal-2-0 \
typelib-ECal"

RDEPENDS:${PN} += "libecal-2.0.so.3 \
typelib-Camel \
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
