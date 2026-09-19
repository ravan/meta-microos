SUMMARY = "Static library for leancrypto"
DESCRIPTION = "Leancrypto provides a general-purpose cryptographic library with PQC-safe \
algorithms. Further it only has POSIX dependencies, and allows all algorithms \
to be used on stack as well as on heap. Accelerated algorithms are transparently \
enabled if possible. \
 \
This subpackage contains the static version of the library \
used for development."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "leancrypto-devel-static-1.8.0-3.2.aarch64.rpm"
RPM_HASH = "ecee472021b30929e7a9ce9a632af1a5fc9deee92e0b10de3c46903fd2eb47e2fedd5c0826f2ddfee8395220fda68bccddc0b6912d1132d0b80a2c9c2f00ed5b"

RPROVIDES:${PN} += "leancrypto-devel-/usr/lib64/libleancrypto.a \
leancrypto-devel-static"

RDEPENDS:${PN} += "leancrypto-devel"

inherit rpm
