SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-openmpi4-2021.10-2.3.aarch64.rpm"
RPM_HASH = "804cf85158927e346eb016c509c809d24c79265a0a6b3482cee3a906f2bea042537d4516fda50ddaa1f72a0c353e976fdb2012adfc380888cc4feb1e294306e3"

RPROVIDES:${PN} += "imb-openmpi4"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
