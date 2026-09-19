SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "qca-qt6-devel-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "21493d83a0d7d222dc0fc1a0a27edcd9b2a652ea27af65c1499d3851acec1f43b0f63d4c076f5b76d595c6027aee8a68d343ce8c854cf5a0edafdcd423114249"

RPROVIDES:${PN} += "cmake-Qca-qt6 \
qca-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Network \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt6-2 \
libqca-qt6.so.2 \
libstdc++.so.6"

inherit rpm
