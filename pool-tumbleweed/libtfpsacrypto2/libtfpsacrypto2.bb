SUMMARY = "Trusted Firmware PSA cryptography library"
DESCRIPTION = "TF-PSA-Crypto is the reference implementation of the PSA cryptography \
API. It provides the cryptographic primitives used by Mbed TLS 4.x. \
 \
This package also ships the libmbedcrypto backward-compatibility \
library, which has the same SONAME (libtfpsacrypto.so.2)."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libtfpsacrypto2-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "64b3607340d03e60e63b831b7d8e02938a74b7739f9fafe9b302a4199e1217e10a6f9d2d1a80f8b355fae81a2061dbc01fdd3211ff1407d74e7c1ef11115b971"

RPROVIDES:${PN} += "libtfpsacrypto.so.2 \
libtfpsacrypto2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
