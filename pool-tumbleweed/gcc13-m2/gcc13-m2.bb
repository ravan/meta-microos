SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-m2-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "0890435428e4735698a3a57941b37e5a13517df6fd446ea47f0ebe4d956390206966b7a7c7d365ab7ef098dcd3140e934e476437bc41082eaee710f88dae28f4"

RPROVIDES:${PN} += "gcc13-m2"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libm2cor18 \
libm2iso18 \
libm2log18 \
libm2min18 \
libm2pim18 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
