SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mvapich3-ofi-2021.10-2.3.aarch64.rpm"
RPM_HASH = "54b1895acea062abf1e0391a06975daab0fd18ac00c55048a7ce9eb325775f473dee38cced172e323aad74a23198a32dc5b2d03f5f8c670461990c5da2ba6c61"

RPROVIDES:${PN} += "imb-mvapich3-ofi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
