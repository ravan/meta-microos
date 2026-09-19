SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "3.13.0"

RPM_NAME = "Botan-3.13.0-1.1.aarch64.rpm"
RPM_HASH = "3bf4e9d2d4fe0cb06a86545818795f4f6aa8cb26e141f1167b3f08cf159a846478133bd439ba0b98268f3f9906eee511772155afa41b0271847fe5869ff99e99"

RPROVIDES:${PN} += "Botan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbotan-3.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
