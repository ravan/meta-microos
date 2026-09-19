SUMMARY = "MPI Benchmarks and tests for mvapich4-ucx"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich4-ucx-3.2-20.4.aarch64.rpm"
RPM_HASH = "c80670ed4ce3a74d5330d09a97d605e822e044a77fad3585fed9f2d848d89fc6f1d1bae12dc3922e996d431e132f58d462bccea3cc16af389ca135c8b9033419"

RPROVIDES:${PN} += "mpitests-mvapich4-ucx"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.0 \
libstdc++.so.6 \
mpitests \
mvapich4-ucx"

inherit rpm
