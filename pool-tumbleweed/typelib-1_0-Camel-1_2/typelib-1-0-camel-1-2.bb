SUMMARY = "Introspection bindings for Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-Camel-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "8387d1576ea183a16a25ad7c965de6f30bbad4dddb73b38fb33015c5641727779bde7e8bb19bc916076d0829247eedc00e6042e3db4f10d1bc3cd539b5f2b933"

RPROVIDES:${PN} += "typelib-1-0-Camel-1-2 \
typelib-Camel"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
