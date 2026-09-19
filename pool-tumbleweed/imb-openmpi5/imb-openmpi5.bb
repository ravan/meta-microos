SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.10"

RPM_NAME = "imb-openmpi5-2021.10-2.4.aarch64.rpm"
RPM_HASH = "af570b218c7ac89ec63f030f9adee08e283307e42db85658a60078110cf6fd0ea0e25e1e87cf9af4ff7ad110eebdd32c049201b3c78d69aa83df153a4b20f24a"

RPROVIDES:${PN} += "imb-openmpi5"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
