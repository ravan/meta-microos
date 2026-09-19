SUMMARY = "Native C interface to BLAS: Shared Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines available \
at www.netlib.org/blas to facilitate usage of BLAS functionality \
for C programmers."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "libcblas3-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "dd53165745a0ed0de9acbc975e2f92abd6803719c8e332e0d041923d321ced4971552afa6d77a88fda365f8d003d16a1af099519a1c2466f1f4cc03d58c05139"

RPROVIDES:${PN} += "libcblas.so.3 \
libcblas3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
update-alternatives"

inherit rpm
