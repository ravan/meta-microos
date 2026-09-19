SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Introspection bindings"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API. \
 \
This package provides the GObject Introspection bindings for the \
telepathy-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "typelib-1_0-TelepathyGlib-0_12-0.24.2-3.9.aarch64.rpm"
RPM_HASH = "483f40b71312bcca770e14849284d60fa2e9aeb131d654bfba41f8e79e2c5cbd7e5706f2bb13ec041216bb92ed94a032cdc32b32d27a1858920dbd6c0ec5cde8"

RPROVIDES:${PN} += "typelib-1-0-TelepathyGlib-0-12 \
typelib-TelepathyGLib"

RDEPENDS:${PN} += "libtelepathy-glib.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
