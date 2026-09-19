SUMMARY = "Introspection bindings for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the libpeas \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "typelib-1_0-Peas-2-2.2.1-2.4.aarch64.rpm"
RPM_HASH = "16fc0651eefd509e70659e5cbf76cf7dc3567d51ad2ec0d273bf43fbc306995f0a2dbff9559640b66309677f82133f359959959f9fd65f76a6e0ace0a8e80f65"

RPROVIDES:${PN} += "typelib-1-0-Peas-2 \
typelib-Peas"

RDEPENDS:${PN} += "libpeas-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
