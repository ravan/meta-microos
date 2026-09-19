SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "qca-qt5-devel-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "9d3343c3f494b708cd3122a7631c1a60f00d0c0b7e7ed4737538cd135d91147a0dcef67a77a15a81a32c1317cff41cfa463afd12bf166e66b0db66733a829ceb"

RPROVIDES:${PN} += "cmake-Qca-qt5 \
libqca-qt5-devel \
pkgconfig-qca2-qt5 \
qca-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
cmake-Qt5Network \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5-2 \
libqca-qt5.so.2 \
libstdc++.so.6 \
pkgconfig-Qt5Core"

inherit rpm
