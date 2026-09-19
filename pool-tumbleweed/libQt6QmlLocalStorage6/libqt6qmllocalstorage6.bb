SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlLocalStorage6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d6188e4833c36a0aa7a1c9e2873e676a2ff9d4fc3317b0bf284cb3c0f7a91156a5c9302e5eb5b17b2c576d79cba55a90b5959c18098e313839f33f6cbe18ffa8"

RPROVIDES:${PN} += "libQt6QmlLocalStorage.so.6 \
libQt6QmlLocalStorage6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
