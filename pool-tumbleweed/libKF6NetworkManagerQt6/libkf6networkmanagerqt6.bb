SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6NetworkManagerQt6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "780acac80b001979958c806b2672dbf6de5923cea51063e0fb215194e93be35373962ccfeb140e2aae079b1224b45383f99aada5fb793e5f44aa477098f6a69e"

RPROVIDES:${PN} += "libKF6NetworkManagerQt.so.6 \
libKF6NetworkManagerQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-networkmanager-qt \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
