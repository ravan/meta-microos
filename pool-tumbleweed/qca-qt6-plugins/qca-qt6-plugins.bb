SUMMARY = "Various plugins for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "qca-qt6-plugins-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "09e2e77f3b0244af067d743b7797c27d8df9a6943efb673a852a192c6b1bed9f3e635ce107bc4066064dbc1d81c4b7082967e00b70d16f7858559056ce57f5f3"

RPROVIDES:${PN} += "libqca-cyrus-sasl.so \
libqca-nss.so \
libqca-pkcs11.so \
qca-qt6-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libnss3.so \
libpkcs11-helper.so.1 \
libqca-qt6.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
