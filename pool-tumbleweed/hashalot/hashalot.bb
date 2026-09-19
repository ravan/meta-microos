SUMMARY = "Read a passphrase and print a hash"
DESCRIPTION = "hashalot  is  a small tool that reads a passphrase from standard \
input, hashes it using the given hash type, and prints the result \
to standard output. Used by legacy encrypted volumes. \
 \
Supported hashes: \
* rmd160 \
* sha256 \
* sha384 \
* sha512"
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "hashalot-0.3-10.9.aarch64.rpm"
RPM_HASH = "110600ba685d0a676e356e43b0ff6de0e4ab78f73a1ea9ae801faec2cb67262d7bebbb9c7db6fc9a35e95436120e2a426c59d7d5bddd68aea30ed32ffeba315a"

RPROVIDES:${PN} += "cryptsetup-/sbin/hashalot \
hashalot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
