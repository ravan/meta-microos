SUMMARY = "Cryptographic toolkit with ciphers, hashes, PRNG and PKI"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains shared libraries"
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt1-1.18.2-3.12.aarch64.rpm"
RPM_HASH = "993b08e161d2ef8587c5f64bc4fc7dd8970f938cfc0731571c74ec214c33f39d9a0dec6c5fe0504d64cab96f51427a0b7b07cad1d75014ead563e7d12c18792c"

RPROVIDES:${PN} += "libtomcrypt.so.1 \
libtomcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtommath.so.1"

inherit rpm
