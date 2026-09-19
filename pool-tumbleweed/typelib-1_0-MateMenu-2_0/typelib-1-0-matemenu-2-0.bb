SUMMARY = "Introspection bindings for the MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "typelib-1_0-MateMenu-2_0-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "b70f2d3291e8f76e8ab1d46e85aad1b51c0531b0c02dff7707d1d743f9b9ec85e84dc04953cec0779ae84c4d4b133a62ff9ee7a524aa306e00c5bdd072a85dd6"

RPROVIDES:${PN} += "typelib-1-0-MateMenu-2-0 \
typelib-MateMenu"

RDEPENDS:${PN} += "libmate-menu.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
