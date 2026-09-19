SUMMARY = "Introspection bindings for libfolks-eds"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "typelib-1_0-FolksEds-0_7-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "0c14b8fc06761a508509d9b38babef08ae339b5690e2afb935277be071478a090d9245fd7cf62e2d87f3e84934b1f15c2b5d30acbd43931f609dcb32ad008acf"

RPROVIDES:${PN} += "typelib-1-0-FolksEds-0-7 \
typelib-FolksEds"

RDEPENDS:${PN} += "typelib-Camel \
typelib-EBookContacts \
typelib-EDataServer \
typelib-Folks \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
