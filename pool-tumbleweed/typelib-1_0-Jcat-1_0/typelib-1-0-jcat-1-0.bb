SUMMARY = "Introspection bindings for libjcat"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "typelib-1_0-Jcat-1_0-0.2.6-2.1.aarch64.rpm"
RPM_HASH = "2d572e096a31f9a86440fa9fccc275ab5a22ae85aa1763f8f0e3e05c957e6b3d5096ab631e1c36320e4ae73cd2fc5cd3ee6b4e7068228c250331691d166e3e50"

RPROVIDES:${PN} += "typelib-1-0-Jcat-1-0 \
typelib-Jcat"

RDEPENDS:${PN} += "libjcat.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json"

inherit rpm
