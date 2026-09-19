SUMMARY = "MPI Benchmarks and tests for openmpi4"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-3.2-20.4.aarch64.rpm"
RPM_HASH = "7f4dc7b248fda0a6efddec5ff9d033af96585e7d51f7fd7dd1bf563ed6b4459e3110fe3fc208f2872309fc70a8240ab8f59e108db4e3302294f520297de13ac7"

RPROVIDES:${PN} += "mpitests-openmpi4"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi4"

inherit rpm
