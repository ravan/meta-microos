SUMMARY = "Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "qca-qt5-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "66cfcf6bcb194980597621ebc823e32791f6f276b09f66b170d81b80579932b4ee2cf035cd4f37aa28aa854ccf48a29218f0b1e694b61bd0daf81f5b0a49a1b3"

RPROVIDES:${PN} += "libqca-gcrypt.so \
libqca-gnupg.so \
libqca-logger.so \
libqca-ossl.so \
libqca-softstore.so \
qca-qt5"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libqca-qt5.so.2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
