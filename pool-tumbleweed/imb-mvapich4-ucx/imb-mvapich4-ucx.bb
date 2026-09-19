SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mvapich4-ucx-2021.10-2.3.aarch64.rpm"
RPM_HASH = "f6605f275b1090b870ebc907e7f19aeef0c46b241e55a1c7a51192371a72b8702c77403ddee5d341a6ca774e1b4f2cd2d33ed9fe7db894cd03f3b50960aadfb9"

RPROVIDES:${PN} += "imb-mvapich4-ucx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.0 \
libstdc++.so.6"

inherit rpm
