SUMMARY = "A cryptographic hash function"
DESCRIPTION = "BLAKE3 is a cryptographic hash function with features like Extendable \
Output Function (XOF), Key Derivation Functions (KDF), Pseudorandom \
Functions (PRF) and Keyed Hashes (MAC). It introduces a Merkle tree \
structure that enables parallel computation across multiple cores. \
BLAKE3 offers a fixed 256-bit output and targets memory efficiency. \
 \
The official C implementation of BLAKE3."
LICENSE = "Apache-2.0"

PV = "1.8.7"

RPM_NAME = "libblake3-0-1.8.7-1.1.aarch64.rpm"
RPM_HASH = "c5761bd8ddc3ade5a857e8cf675e707b79672cc58ecf604aa0a4ce5313eba82235ed83306023f257f7e45fc02c9b1a1ce7fc7c53aa8e24bc9d9a11ecf2c72e04"

RPROVIDES:${PN} += "libblake3-0 \
libblake3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
