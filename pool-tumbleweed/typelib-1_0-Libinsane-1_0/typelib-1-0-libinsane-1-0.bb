SUMMARY = "Introspection bindings for libinsane"
DESCRIPTION = "This package provides the GObject Introspection bindings for the \
libinsane library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "typelib-1_0-Libinsane-1_0-1.0.10-1.14.aarch64.rpm"
RPM_HASH = "4740022cc79eefd4a88c8639ab6ec0ba728b0636ff32472b4b2647a410eb5d5fdada01c754162313065f44d85be41f723a6743e5b50ceabe0115f05364036b97"

RPROVIDES:${PN} += "typelib-1-0-Libinsane-1-0 \
typelib-Libinsane"

RDEPENDS:${PN} += "libinsane-gobject.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
