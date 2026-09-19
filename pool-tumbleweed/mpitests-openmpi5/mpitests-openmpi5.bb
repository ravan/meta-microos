SUMMARY = "MPI Benchmarks and tests for openmpi5"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi5-3.2-20.4.aarch64.rpm"
RPM_HASH = "d727b527bb884568c6c76b6216a309aef081401a18e63626a5ff030cfc4d26133b5b330d24b736c24a3fa03aaeac800b675f3e83ccc3101f25ba566615023541"

RPROVIDES:${PN} += "mpitests-openmpi5"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi5"

inherit rpm
