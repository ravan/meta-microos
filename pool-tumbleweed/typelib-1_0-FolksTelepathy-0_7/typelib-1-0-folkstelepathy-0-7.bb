SUMMARY = "Introspection bindings for libfolks-telepathy"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "typelib-1_0-FolksTelepathy-0_7-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "fe29064f4ba9d0ce8009f1f8c36e32fad98019bb6b90e818a139ba08735f696f833c7aba23be716cf34c9a0378f68c12e339d5756ea216ecf14068a517922366"

RPROVIDES:${PN} += "typelib-1-0-FolksTelepathy-0-7 \
typelib-FolksTelepathy"

RDEPENDS:${PN} += "typelib-Folks \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-TelepathyGLib"

inherit rpm
