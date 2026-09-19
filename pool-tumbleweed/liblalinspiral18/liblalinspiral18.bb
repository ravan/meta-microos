SUMMARY = "Shared library for LAL Inspiral"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Inspiral library."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "liblalinspiral18-5.0.3-2.1.aarch64.rpm"
RPM_HASH = "8566224520cf108dedc05cd8a9b5500e1434888e2a8b4a7817a59d3c4e804429586eb1b1bb2513f088afbc0a3371f31f2d771ee12527250a20e7a2634aa65085"

RPROVIDES:${PN} += "liblalinspiral.so.18 \
liblalinspiral18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalburst.so.8 \
liblalframe.so.14 \
liblalmetaio.so.11 \
liblalsimulation.so.37 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
