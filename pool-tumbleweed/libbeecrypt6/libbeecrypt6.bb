SUMMARY = "An open source cryptography library"
DESCRIPTION = "BeeCrypt is an ongoing project to provide a strong and fast \
cryptography toolkit. Includes entropy sources, random generators, \
block ciphers, hash functions, message authentication codes, \
multiprecision integer routines, and public key primitives."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.2"

RPM_NAME = "libbeecrypt6-4.1.2-29.8.aarch64.rpm"
RPM_HASH = "334d96357964a9aefe61435680fa83b9f7b0683cc9a660e1c2cad041a0fdc495af1504c92156a9d571f8973a5b1d35897a7ffd3c3f6f7378cb9816a02666a70f"

RPROVIDES:${PN} += "libbeecrypt.so.6 \
libbeecrypt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
