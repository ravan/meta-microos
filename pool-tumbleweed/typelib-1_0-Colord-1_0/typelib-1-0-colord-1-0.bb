SUMMARY = "Introspection bindings for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "typelib-1_0-Colord-1_0-1.4.8-3.1.aarch64.rpm"
RPM_HASH = "c4062b121e7d46d44dfee1ce0f17431fa4e0f9a5ad441e8d8ad56274b70638a128593e52d2cc2f16850e0ac9743260136205aa9934b8d5180fd5023fb858f431"

RPROVIDES:${PN} += "typelib-1-0-Colord-1-0 \
typelib-Colord"

RDEPENDS:${PN} += "libcolord.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
