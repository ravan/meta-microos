SUMMARY = "Shared library for LAL Inference"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Inference library."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.9"

RPM_NAME = "liblalinference23-4.1.9-3.1.aarch64.rpm"
RPM_HASH = "3a574006eeaaa54fcecae041fabb1871ca8a9d4495e4eeacd4c0a351aa61422b8b5cab70be600902362f904d969c73512d5be566cb828bacc548d31efbc6ff40"

RPROVIDES:${PN} += "liblalinference.so.23 \
liblalinference23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalburst.so.8 \
liblalframe.so.14 \
liblalinspiral.so.18 \
liblalmetaio.so.11 \
liblalsimulation.so.37 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
