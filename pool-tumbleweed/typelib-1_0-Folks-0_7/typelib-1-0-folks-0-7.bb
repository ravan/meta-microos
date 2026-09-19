SUMMARY = "Introspection bindings for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "typelib-1_0-Folks-0_7-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "cb33edcf57eb270fcf4d15886e3e75d159aeacd2e8e6dab8f5f9a2ea0c0b002d73d880726b676302785d21317098346aa715472c28ffb4bce7460e0ec8bbd0ac"

RPROVIDES:${PN} += "typelib-1-0-Folks-0-7 \
typelib-Folks \
typelib-FolksDummy"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gee \
typelib-Gio"

inherit rpm
