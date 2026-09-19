SUMMARY = "MPI Benchmarks and tests for mpich-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-3.2-20.4.aarch64.rpm"
RPM_HASH = "c2f59dd4b4e6291e07d674230e2afd861b82be0d18939a18b1835afbe77323badd1b435dd98d2a184d31df48adb9bfc4d9efa3ab1a1e691d9a0f6e706b10929f"

RPROVIDES:${PN} += "mpitests-mpich-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6 \
mpich-ofi \
mpitests"

inherit rpm
