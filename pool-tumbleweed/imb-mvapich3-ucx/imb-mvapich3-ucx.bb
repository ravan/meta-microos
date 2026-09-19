SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-mvapich3-ucx-2021.10-2.3.aarch64.rpm"
RPM_HASH = "534e654ea1ee9a3604a657202bcfe3f7c549f578852f6e716e96109f32ad991ee28a1b7b7144186c077438e77b47e46839c0ef7fcc9232486190fcfdeb9c2205"

RPROVIDES:${PN} += "imb-mvapich3-ucx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
