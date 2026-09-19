SUMMARY = "Introspection bindings for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.106"

RPM_NAME = "typelib-1_0-Libmsi-1_0-0.106-1.7.aarch64.rpm"
RPM_HASH = "76c8fdd1a3cd6f45355ada2664a0c882ce43f219f58ed58a52df12ed94ddac2a219935afd31edddcb9d49f62d90a21c42158e91650a406b9f45b775b4935e0bc"

RPROVIDES:${PN} += "typelib-1-0-Libmsi-1-0 \
typelib-Libmsi"

RDEPENDS:${PN} += "libmsi-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
