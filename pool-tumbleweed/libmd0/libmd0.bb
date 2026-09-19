SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.2.0"

RPM_NAME = "libmd0-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "eb2e6fff19cd0bf3a5019b7e0c0c8b5af6a7b28d61567b1c5896f5411ff9bd5b62dd1fbc9873a0113526c8d64e2a2dca46e0b2c44fe01350e537be0a563fc8b9"

RPROVIDES:${PN} += "libmd.so.0 \
libmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
