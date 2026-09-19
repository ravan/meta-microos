SUMMARY = "Introspection bindings for the ATK accessibility toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices. \
 \
This package provides the GObject Introspection bindings for ATK."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "typelib-1_0-Atk-1_0-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "414b6c858b14fabe86d4d6d5971d842678a9daa78691e2db44f76444362be85bb93c9115e015888b2bf82b506a0680355e2ec48ac9d79eb7da27178005d74f09"

RPROVIDES:${PN} += "typelib-1-0-Atk-1-0 \
typelib-Atk"

RDEPENDS:${PN} += "libatk-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
