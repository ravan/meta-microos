SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mvapich4-ofi-2021.10-2.3.aarch64.rpm"
RPM_HASH = "b96d9104147468712dde89254bb04eb834af9197b59ca18cc731a23d7eae7d55f2e3acf96e13adab70ce3c11e652e589fe45fa4afffac0829b688727bfd84809"

RPROVIDES:${PN} += "imb-mvapich4-ofi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.0 \
libstdc++.so.6"

inherit rpm
