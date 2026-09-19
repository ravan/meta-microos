SUMMARY = "PMI-X munge plugin version 1"
DESCRIPTION = "This package contains the munge plugin for libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-plugin-munge-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "b1077002dd0ceadcaa53f9db0cf7e544fc958b08f9f9aca0c1a6717d5df0e43ea2d0ed33051a69ae1873d1bfc6ef250a10883f1db52917f27822fde73c952bd0"

RPROVIDES:${PN} += "pmix-plugin-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmca-common-dstore1 \
libmunge.so.2 \
libpmix.so.2"

inherit rpm
