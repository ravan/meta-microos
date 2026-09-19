SUMMARY = "MPI Benchmarks and tests for mvapich3-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich3-ofi-3.2-20.4.aarch64.rpm"
RPM_HASH = "9736472f772ff22ce954c7fa6308981cd79ab36222ab0a0b27fe92ac423092b8efe2ec61e23cecdcbf4317ab0cf4c4739d9d91b68e11e8090b7c218285be73bb"

RPROVIDES:${PN} += "mpitests-mvapich3-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich3-ofi"

inherit rpm
