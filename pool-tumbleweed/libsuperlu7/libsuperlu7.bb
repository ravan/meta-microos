SUMMARY = "SuperLU matrix solver"
DESCRIPTION = "SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "libsuperlu7-7.0.1-1.5.aarch64.rpm"
RPM_HASH = "e02f6aebc3e2b50d30280e20b9857e35d1be77cae32786127e8c99be5c88db30d52635d3bfedc2e3c17df4e2b648537063a589d5b67c15aa0db0d2818f1d14b1"

RPROVIDES:${PN} += "libsuperlu.so.7 \
libsuperlu7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
