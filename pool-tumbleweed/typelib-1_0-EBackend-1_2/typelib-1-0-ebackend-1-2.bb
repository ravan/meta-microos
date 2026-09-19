SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "typelib-1_0-EBackend-1_2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "952f954d60e2535ba4a4101cbd2b1867c19b1f088bb1f9baa2d24db81ecea04bf32b1691bc7dcefd73b1894bae4aea5f08d0c1d982097519fd80bc3193b92e83"

RPROVIDES:${PN} += "typelib-1-0-EBackend-1-2 \
typelib-EBackend"

RDEPENDS:${PN} += "libcamel-1.2.so.67 \
libebackend-1.2.so.11 \
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
