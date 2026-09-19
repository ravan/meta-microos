SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EDataBook-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "cd3cd362343ec6a1c9325dac3ec450db15f29e13f065a70eeda4118202026c193731d14ccc87d724334da6fa63719f7f5146dff608507cb1f608bc41facec760"

RPROVIDES:${PN} += "typelib-1-0-EDataBook-1-2 \
typelib-EDataBook"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libebook-contacts-1.2.so.5 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBackend \
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
