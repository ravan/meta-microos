SUMMARY = "Cryptographic library with stack-only support and PQC-safe algorithms"
DESCRIPTION = "Leancrypto provides a general-purpose cryptographic library with PQC-safe \
algorithms. Further it only has POSIX dependencies, and allows all algorithms \
to be used on stack as well as on heap. Accelerated algorithms are transparently \
enabled if possible. \
 \
This subpackage contains the FIPS 140 compliant version of the library."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "libleancrypto-fips1-1.8.0-3.2.aarch64.rpm"
RPM_HASH = "47927b86d48c558b5c92b01ab8eb1ec4b494231878e206869b4cf3dcab0c8abb9c1b6c801a25f641fa4efae68c916a9902402e8f583f5fd8aad04d09bf3fc721"

RPROVIDES:${PN} += "libleancrypto-fips.so.1 \
libleancrypto-fips1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
