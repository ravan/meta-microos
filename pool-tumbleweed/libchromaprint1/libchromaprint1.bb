SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "libchromaprint1-1.6.0-1.8.aarch64.rpm"
RPM_HASH = "655d7a66242111881da4ff45e969412d9178c7f4fe1060b5a1d2f51a1e6bd9c540ccaf5cbd5006fbd92a47f4b579e3a716905f6b91326c805e373dbd4a51e245"

RPROVIDES:${PN} += "libchromaprint.so.1 \
libchromaprint1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
