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

RPM_NAME = "qca-qt5-plugins-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "212618d2df91b40fb4fcccc6d17994eebb2c5bc9e8faee3ff04185434a8fb01b2529e4323ea773bfc8c58c4b452d3977f026613de728a64192ced67d1f514e53"

RPROVIDES:${PN} += "libqca-cyrus-sasl.so \
libqca-nss.so \
libqca-pkcs11.so \
libqca-qt5-plugins \
qca-qt5-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnss3.so \
libpkcs11-helper.so.1 \
libqca-qt5.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
