SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "3.13.0"

RPM_NAME = "libbotan-3-13-3.13.0-1.1.aarch64.rpm"
RPM_HASH = "c4a014ff6a6d316669ac3e0a0e2f889a10747fd8ceded1bf38899dd2dadd29b8bf87ec9d28e6193f9356f53beabe8a8c188eaaad1ff524238cb7b87bc04f8930"

RPROVIDES:${PN} += "libbotan-3-13 \
libbotan-3.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtspi.so.1 \
libz.so.1"

inherit rpm
