SUMMARY = "Non-cryptographic hash algorithm"
DESCRIPTION = "xxHash is a hash algorithm. It completes the SMHasher test suite which \
evaluates collision, dispersion and randomness qualities of hash functions. \
Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.8.3"

RPM_NAME = "xxhash-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "5efab484c0ff6643b2cd26a749633e4a2496d7df77df6ff9536db0366ed1aaa7fee5eea921f46d3549e6b8e1996d45a50e1175698c1c173a83c36f080eccda05"

RPROVIDES:${PN} += "xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
