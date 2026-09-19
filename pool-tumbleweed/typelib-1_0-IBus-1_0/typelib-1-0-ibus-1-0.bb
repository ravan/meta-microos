SUMMARY = "Introspection bindings for IBus"
DESCRIPTION = "This package contains the introspection bindings for the IBus library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "typelib-1_0-IBus-1_0-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "0ec076ade14f5156fcc055665aa5e1615c58a11bc14434bfa1236d51eef469a6d2d95ea00f1aed35bec25a1d5ff95da984af94112a5fc39339ea938c7223638e"

RPROVIDES:${PN} += "typelib-1-0-IBus-1-0 \
typelib-IBus"

RDEPENDS:${PN} += "libibus-1.0.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
