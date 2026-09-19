SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6DBusAddons6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "82effc6a0afb33f44d07c4a1f9f0b572d3367303ffbcffcc3cade2117246249973a4b6a56630948d31ee94630c101853bdc54fdda6cf66df45e97e4a9df0f87c"

RPROVIDES:${PN} += "libKF6DBusAddons.so.6 \
libKF6DBusAddons6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kdbusaddons \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
