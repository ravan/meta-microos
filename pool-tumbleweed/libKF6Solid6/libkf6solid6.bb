SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework. It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Solid6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "df0d0eb93f5fc7a157ede558aff2a0a8fda95ae33ad0f3e7d26bee212014ead3e148240abf9e360b83050fe11a90d6f5b2630638cf1965d5a58b57b3a5697fa2"

RPROVIDES:${PN} += "libKF6Solid.so.6 \
libKF6Solid6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-solid \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libmount.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
