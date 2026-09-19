SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Solid5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "4d4fbcacbddf2e7142eb9b486cb6e8c7bc60df5f7302a6415fcd9b96b7555d2127dd8ff350645007cbcb7cb097e686fe688b63ff06caf57ab7fb789488464de2"

RPROVIDES:${PN} += "libKF5Solid.so.5 \
libKF5Solid5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libmount.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
