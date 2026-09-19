SUMMARY = "Library Implementing a Small Layer on Top of PKCS#11 API"
DESCRIPTION = "Libp11 is a library implementing a small layer on top of PKCS#11 API to \
make using PKCS#11 implementations easier. \
 \
The official name for PKCS#11 is 'RSA Security Inc. PKCS #11 \
Cryptographic Token Interface (Cryptoki)'. \
 \
Libp11 source code include the official header files (version 2.20) and \
thus is 'derived from the RSA Security Inc. PKCS #11 Cryptographic \
Token Interface (Cryptoki)'."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.17"

RPM_NAME = "libp11-devel-0.4.17-1.4.aarch64.rpm"
RPM_HASH = "27e721d38f14ce4d56298acb49da364c4468b4c11f4fdb73d7fc3ce6f4f8d5bf62ec6e93223aed2d782dfc89c6c1a8238347cd15203832ed934a1a0724b8249c"

RPROVIDES:${PN} += "libp11-devel \
pkgconfig-libp11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp11-3 \
openssl-devel"

inherit rpm
