SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5DBusAddons5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "3918c4e18e0c5daf643a089c857ebc22634a40cda36fb6e9ad2c42bd76a060726808acdb1458eaa9a13333a8094ffe5bfda142eead55e7eee565c7d3f3a6da88"

RPROVIDES:${PN} += "libKF5DBusAddons.so.5 \
libKF5DBusAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
