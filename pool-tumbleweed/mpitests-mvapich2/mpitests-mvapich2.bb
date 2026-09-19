SUMMARY = "MPI Benchmarks and tests for mvapich2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-3.2-20.4.aarch64.rpm"
RPM_HASH = "20997a67d22ba009c42cdd0bdf70199a761a20f3df675a694d500b74e7a084edc93ad47f27a8fb0ffaa25e08130e46e1bbb054c43d59127b427747c8336d47b8"

RPROVIDES:${PN} += "mpitests-mvapich2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich2"

inherit rpm
