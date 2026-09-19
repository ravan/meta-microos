SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EBookContacts-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "964cec5d1f8e65d2877d0e8ffe2c1c4ff241f2181eedeed52337e419f5312a93adbaebbeda804449001335047e98201db2843d76efe0f55ed9ad86f13a0cfc12"

RPROVIDES:${PN} += "typelib-1-0-EBookContacts-1-2 \
typelib-EBookContacts"

RDEPENDS:${PN} += "libebook-contacts-1.2.so.5 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
