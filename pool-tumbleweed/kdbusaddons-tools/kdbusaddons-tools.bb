SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdbusaddons-tools-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "6f6cebb175780423fefcafd3302d3ba6f23b07b61ac5c026591e0f1135c417ad1b67cd48b42133b78f4cdcb69cfc71d3cb5fce6512614655eeeeac8f60ab57b4"

RPROVIDES:${PN} += "kdbusaddons-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6"

inherit rpm
