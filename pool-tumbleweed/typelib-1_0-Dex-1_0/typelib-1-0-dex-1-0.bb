SUMMARY = "Introspection bindings for libdex"
DESCRIPTION = "This package contains the introspection bindings for libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "typelib-1_0-Dex-1_0-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "fd8b835625728a1d9a01990b51484d5fbc679674449ea9d312fc8165129a8bc2c70f197cc1db6cf23b1a221c105f90fa7095ac1c3a81dfa0527f08a6870a808c"

RPROVIDES:${PN} += "typelib-1-0-Dex-1-0 \
typelib-Dex"

RDEPENDS:${PN} += "libdex-1.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
