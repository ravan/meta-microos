SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6ModemManagerQt6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f6da0ace6c88eb6a69d5a05a7ac8ce4f6b01c5bb1b1600de7e0bb03cfce8974f43d53011bdd009a1ce6dd635bc443858506963239540db201dc255bb0f4b8d5f"

RPROVIDES:${PN} += "libKF6ModemManagerQt.so.6 \
libKF6ModemManagerQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-modemmanager-qt \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
