SUMMARY = "MPI Benchmarks and tests for mvapich4-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich4-ofi-3.2-20.4.aarch64.rpm"
RPM_HASH = "e811964cdb85d11edb67484f2fc1583f8a94003be3077870ce8e71de9f8f1ab75f6af6ba959ca562889528a1602cd2ad3b080748b64ec823dacf5a94aca63b77"

RPROVIDES:${PN} += "mpitests-mvapich4-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.0 \
libstdc++.so.6 \
mpitests \
mvapich4-ofi"

inherit rpm
