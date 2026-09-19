SUMMARY = "Introspection bindings for libcolorhug"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolorhug library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "typelib-1_0-Colorhug-1_0-1.4.8-3.1.aarch64.rpm"
RPM_HASH = "f5971bec6149296b5c10e08fca45bd75a891ec40abb5000bdab20d21e41e1eefdd6bed2bdfd2e7d5fa3f06c8ac3897498173701b2baf2e29860d8cd218f633ae"

RPROVIDES:${PN} += "typelib-1-0-Colorhug-1-0 \
typelib-Colorhug"

RDEPENDS:${PN} += "libcolorhug.so.2 \
typelib-Colord \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GUsb \
typelib-Gio \
typelib-Json"

inherit rpm
