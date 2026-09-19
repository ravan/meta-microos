SUMMARY = "Introspection bindings for the libical glib bindings."
DESCRIPTION = "This package provides the gobject-introspection bindings for libical-glib."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "typelib-1_0-ICalGLib-3_0-3.0.20-1.8.aarch64.rpm"
RPM_HASH = "a56483eb8da24e6c12849392551ebd34401642f8816b8f2ab49e6fbc41e3304861b51e5bd9daacc9258e165ad7530aad81f6f78ac122397772bb7ab57db151d7"

RPROVIDES:${PN} += "typelib-1-0-ICalGLib-3-0 \
typelib-ICalGLib"

RDEPENDS:${PN} += "libical-glib.so.3 \
typelib-GLib \
typelib-GObject"

inherit rpm
