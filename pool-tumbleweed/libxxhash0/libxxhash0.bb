SUMMARY = "Non-cryptographic hash algorithm"
DESCRIPTION = "xxHash is a hash algorithm. It completes the SMHasher test suite which \
evaluates collision, dispersion and randomness qualities of hash functions. \
Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "libxxhash0-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "2f9f02dfcd2a35b66d0cb45747705ce272cad5701f688db47c400f229e677316395526f1d40250b7afb74e53bbb4466e6eedac74ad078ccbcafa3a394940c8b9"

RPROVIDES:${PN} += "libxxhash.so.0 \
libxxhash0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
