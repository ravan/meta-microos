SUMMARY = "MPI Benchmarks and tests for mpich"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-3.2-20.4.aarch64.rpm"
RPM_HASH = "4b00a97e4bea8802c3fc37aa088983d8628905278d4d10786dfe8252dbad04a63b7186433c74cc052bec1b242b1010acdea58624a6be4022d27dcfc33cc2fecb"

RPROVIDES:${PN} += "mpitests-mpich"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6 \
mpich \
mpitests"

inherit rpm
