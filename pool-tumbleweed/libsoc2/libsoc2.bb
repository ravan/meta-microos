SUMMARY = "C library for interfacing with common SoC peripherals"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc2-0.8.2-4.3.aarch64.rpm"
RPM_HASH = "f68a7037ca2e1602fae2e53f7d47469bf81d2b00cf5190e5686f505afdd2b9d3c6bf8c1d0a9180a155ff2217684bbaad9e639e628436f297862d9c0678a7fbc2"

RPROVIDES:${PN} += "libsoc.so.2 \
libsoc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
