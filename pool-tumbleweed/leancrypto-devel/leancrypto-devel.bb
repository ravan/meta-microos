SUMMARY = "Development files for leancrypto, a cryptographic library"
DESCRIPTION = "Leancrypto provides a general-purpose cryptographic library with PQC-safe \
algorithms. Further it only has POSIX dependencies, and allows all algorithms \
to be used on stack as well as on heap. Accelerated algorithms are transparently \
enabled if possible. \
 \
This subpackage holds the development headers for the library."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "leancrypto-devel-1.8.0-3.2.aarch64.rpm"
RPM_HASH = "560a43aaffd8548c10249b08187c3ff6797b37fae1c117688117a0566a660a407aa988d6fef44322176d858605f2d24985657d228e933047b51e6328f48e04d6"

RPROVIDES:${PN} += "leancrypto-devel \
pkgconfig-leancrypto \
pkgconfig-leancrypto-fips"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libleancrypto-fips1 \
libleancrypto1"

inherit rpm
