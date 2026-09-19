SUMMARY = "C library providing BLAKE2b, BLAKE2s, BLAKE2bp, BLAKE2sp"
DESCRIPTION = "C library providing BLAKE2b, BLAKE2s, BLAKE2bp, BLAKE2sp. \
 \
BLAKE2 is a cryptographic hash function faster than MD5, SHA-1, SHA-2, \
and SHA-3, yet is at least as secure as the latest standard SHA-3."
LICENSE = "CC0-1.0"

PV = "0.98.1"

RPM_NAME = "libb2-1-0.98.1-2.4.aarch64.rpm"
RPM_HASH = "cc5e98e0b5f090f0411eaa7a5951df242056676f3967574a14e54f9b1f33e3d2ef7bb09d19165b943e27da5a29afb3b94ef5147119436ebcb95385c58453405e"

RPROVIDES:${PN} += "libb2-1 \
libb2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1"

inherit rpm
