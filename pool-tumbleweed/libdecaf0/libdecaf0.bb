SUMMARY = "Ed448-Goldilocks-based elliptic curve cryptography library"
DESCRIPTION = "Ed448-Goldilocks is an Edwards-form elliptic curve proposed by \
Michael Hamburg in 2015 and is suitable for cryptographic \
operation with small keysizes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libdecaf0-1.0.2-1.11.aarch64.rpm"
RPM_HASH = "a8ed8dd82ecaf26c2e5080f96d025c1bdf4f2e8a5cc1e10131f8dcd61b6de0cf13600711700382bede1136d5867c20066bfc5f85e7a4f554299d7155acdefa4a"

RPROVIDES:${PN} += "libdecaf.so.0 \
libdecaf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
