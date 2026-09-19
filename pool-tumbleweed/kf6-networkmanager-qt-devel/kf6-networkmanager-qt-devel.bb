SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-networkmanager-qt-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e65c413b9b9e4d9fa507d3f1f4c56536f080743d6011ea9f554cc994f8412b78e30217f6506414b59fbacb9a40113638b272fd6d0e50b12a1680f3b5e559f1f2"

RPROVIDES:${PN} += "cmake-KF6NetworkManagerQt \
kf6-networkmanager-qt-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6DBus \
libKF6NetworkManagerQt6 \
pkgconfig-gio-2.0 \
pkgconfig-libnm"

inherit rpm
