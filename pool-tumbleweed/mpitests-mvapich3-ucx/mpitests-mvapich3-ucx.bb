SUMMARY = "MPI Benchmarks and tests for mvapich3-ucx"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich3-ucx-3.2-20.4.aarch64.rpm"
RPM_HASH = "f96c743f97bb626474ddc740e07fcf7b77680d19495a84809c16930025246dafcabc1ea0ed313a9bdfa1e6050396d2400ba70640962d43307e6d64878190271c"

RPROVIDES:${PN} += "mpitests-mvapich3-ucx"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich3-ucx"

inherit rpm
