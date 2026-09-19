SUMMARY = "Introspection bindings for libnice"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE). \
 \
This package provides the GObject Introspection bindings for libnice."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.23"

RPM_NAME = "typelib-1_0-Nice-0_1-0.1.23-2.3.aarch64.rpm"
RPM_HASH = "ce60e228001cc3851ef7e4e1c069058193adb3f4911c839d0e112766781d5d67873af0e03ee5b9e1171820e262edcce97e8c5b31da4efa35e24bb8e10d5bf244"

RPROVIDES:${PN} += "typelib-1-0-Nice-0-1 \
typelib-Nice"

RDEPENDS:${PN} += "libnice.so.10 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
