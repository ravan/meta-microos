SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdbusaddons-tools-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "34fa1f46570eb7db79668d34e6ce966afb7950d70ed80a35e38740e5b6f0e4bed3cc48f7351131cfee0eeb4612cbbe8eb0f83da329a45fb22fe52ef947dcc1dd"

RPROVIDES:${PN} += "kf6-kdbusaddons-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6"

inherit rpm
