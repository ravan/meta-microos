SUMMARY = "Introspection bindings for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
totem-pl-parser library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.7"

RPM_NAME = "typelib-1_0-TotemPlParser-1_0-3.26.7-1.4.aarch64.rpm"
RPM_HASH = "8030e4e59abb1a09fe968ed8a190be3055b2edc9b21b095b6c3ccc3ededdb6aee4646f469c983e345ba6813de9bec3e3aca306e2685a141b7500bb6090a74e8f"

RPROVIDES:${PN} += "typelib-1-0-TotemPlParser-1-0 \
typelib-TotemPlParser"

RDEPENDS:${PN} += "libtotem-plparser.so.18 \
totem-pl-parser \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
