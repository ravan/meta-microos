SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "typelib-1_0-GPaste-2-50.9-1.1.aarch64.rpm"
RPM_HASH = "5ff830950056855717c61d16179acc4c8d42acf33f597466b5f88bff8d144b150624a99c28efba9c08af83329e7bd5529d286cdb55b073fd022d186ba2bd0767"

RPROVIDES:${PN} += "typelib-1-0-GPaste-2 \
typelib-GPaste"

RDEPENDS:${PN} += "libgpaste-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
