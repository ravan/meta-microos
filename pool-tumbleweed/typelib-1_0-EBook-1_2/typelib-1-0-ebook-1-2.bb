SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EBook-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "0ee6d2d4f717a1fe8d5d92bc0c5a3ae7dbc60a505bd6b352982f660b68b5a3b15faf549833baca4f9f9e6c1a612298561109a5af617062387e8861fa33ad6319"

RPROVIDES:${PN} += "typelib-1-0-EBook-1-2 \
typelib-EBook"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBookContacts \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
