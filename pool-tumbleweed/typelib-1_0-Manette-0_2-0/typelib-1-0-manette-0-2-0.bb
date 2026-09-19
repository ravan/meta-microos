SUMMARY = "GObject introspection bindings for liblibmanette"
DESCRIPTION = "libmanette allows easy access to game controllers. \
This subpackage contains the gobject bindings for the liblibmanette \
shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "typelib-1_0-Manette-0_2-0-0.2.13-2.3.aarch64.rpm"
RPM_HASH = "fc8f84e1ba8eab0656c5fd8712f51c2dbf71cb14cb6b668960c6fdb4613dd8f90ac30b8cdd5b3f4e864c078d0b0ff586e26979513e73b2cbe365c2332a607ba9"

RPROVIDES:${PN} += "typelib-1-0-Manette-0-2-0 \
typelib-Manette"

RDEPENDS:${PN} += "libmanette-0.2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GUdev \
typelib-Gio"

inherit rpm
