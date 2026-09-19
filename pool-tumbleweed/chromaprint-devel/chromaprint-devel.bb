SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "chromaprint-devel-1.6.0-1.8.aarch64.rpm"
RPM_HASH = "af75e1bc07ceace595285a113e5e561b5faee2c062fe41a8b11c0ca194c467ac5611cfc326f1430916041f5bb94372fc4204f25ddfd6cb1c89487c1280169b84"

RPROVIDES:${PN} += "chromaprint-devel \
cmake-Chromaprint \
libchromaprint-devel \
pkgconfig-libchromaprint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchromaprint1"

inherit rpm
