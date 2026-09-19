SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EDataServer-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "78e300426245d742f14a8bbf86a153da67f84d498a3fd3c052f52e34b963c62331d7b0c04ff2b0fa5b957b90d0413610b1634778e7f3394ddee36e29c7110789"

RPROVIDES:${PN} += "typelib-1-0-EDataServer-1-2 \
typelib-EDataServer"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
