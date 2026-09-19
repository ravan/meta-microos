SUMMARY = "Introspection bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package provides the GObject Introspection bindings for the \
libatspi library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "typelib-1_0-Atspi-2_0-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "720736af2613b904bbb034f93ca4b99a7a966c719e52b3f633cd252837289e74019b7b466a83a99f2f8b95facf3a48f826937377531dbfaaebb0d16e93fc6c95"

RPROVIDES:${PN} += "typelib-1-0-Atspi-2-0 \
typelib-Atspi"

RDEPENDS:${PN} += "libatspi.so.0 \
typelib-DBus \
typelib-GLib \
typelib-GObject"

inherit rpm
