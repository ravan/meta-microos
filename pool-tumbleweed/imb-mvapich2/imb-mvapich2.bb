SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mvapich2-2021.10-2.3.aarch64.rpm"
RPM_HASH = "c074e6b9c1e770f9e02a0efc1d4b197e28a01292cb0b0525ee83245eaa0dceefe1ae4323a2d097b51dff0a900ba9846b6f14c6f34ed3d39e59b8fdd737a6d749"

RPROVIDES:${PN} += "imb-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
