SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20260905"

RPM_NAME = "libcaes1-20260905-1.1.aarch64.rpm"
RPM_HASH = "c906a3c64843ff409ef5e0cac44b65ff01dc4a2cd297111826aa41905fe4160d51bc65f4ba0c639dd17c24dec5896b8f8a5dbe9125eaf1721e3e53ed6178c20a"

RPROVIDES:${PN} += "libcaes.so.1 \
libcaes1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
