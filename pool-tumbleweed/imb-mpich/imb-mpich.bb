SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mpich-2021.10-2.3.aarch64.rpm"
RPM_HASH = "86971d9defff7bba4b6f5a2687723eefbbc9de45effd3d8217a784f75c88e5c495b7d7e8dcca9eba2f5dc662c444cede5fbe163f1ca11471f25e313982c73476"

RPROVIDES:${PN} += "imb-mpich"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
