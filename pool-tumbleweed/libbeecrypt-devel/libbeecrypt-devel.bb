SUMMARY = "An open source cryptography library"
DESCRIPTION = "BeeCrypt is an ongoing project to provide a strong and fast \
cryptography toolkit. Includes entropy sources, random generators, \
block ciphers, hash functions, message authentication codes, \
multiprecision integer routines, and public key primitives."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.2"

RPM_NAME = "libbeecrypt-devel-4.1.2-29.8.aarch64.rpm"
RPM_HASH = "ad3db9a67efa95985d4d7aa61f7d4dd533e334471d5b96a6c7262a1230f3a1acf77800b55c2ad153727f2a831979a3f75642bb9a7fb34ce7449c1a0d9dbeca8e"

RPROVIDES:${PN} += "libbeecrypt-devel"

RDEPENDS:${PN} += "libbeecrypt6"

inherit rpm
