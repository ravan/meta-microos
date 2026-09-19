SUMMARY = "Shared library for LAL Burst"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Burst library."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "liblalburst8-2.0.7-2.1.aarch64.rpm"
RPM_HASH = "0b990308735967fbe7456702ecc99aa5d8a1a4f6fc93fccdaa8688b38ef6ad60564d356fd3e93b2e0f29822adcaca2947b7d8d89a6c7a6fcd83c356813cacf9e"

RPROVIDES:${PN} += "liblalburst.so.8 \
liblalburst8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalmetaio.so.11 \
liblalsimulation.so.37 \
libm.so.6"

inherit rpm
