SUMMARY = "Introspection bindings for libwlembed"
DESCRIPTION = "This package provides the GObject Introspection bindings for libwlembed."
LICENSE = "GPL-3.0-only"

PV = "0.0.0"

RPM_NAME = "typelib-1_0-Libwlembed-0-0.0.0-1.7.aarch64.rpm"
RPM_HASH = "32d53fe7e42f4823ec5aba98b1a9ba1a4ff91caeabff0a70bdcc582909ee910299e4bcf1c25136db8b572845e90889f59eb2f98f7ef43474d9e65770b2464f75"

RPROVIDES:${PN} += "typelib-1-0-Libwlembed-0 \
typelib-Libwlembed"

RDEPENDS:${PN} += "libwlembed-0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
