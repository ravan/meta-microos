SUMMARY = "Introspection bindings for libdbusmenu-glib4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the dbusmenu \
library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-Dbusmenu-0_4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "49c5317cf57a1ba4faab7e73d6b40bce44d5e0dc68b63b660a202b5a46e517358e81a754135eff0ab86645f1a7bb0841cd3b07738fe9bbec982f3385a20eab1b"

RPROVIDES:${PN} += "typelib-1-0-Dbusmenu-0-4 \
typelib-Dbusmenu"

RDEPENDS:${PN} += "libdbusmenu-glib.so.4 \
typelib-GLib \
typelib-GObject"

inherit rpm
