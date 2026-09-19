SUMMARY = "Chromaprint Audio Fingerprinting Command Line Tool"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source. \
This package contains fpcalc, a command-line tool to perform Chromaprint \
fingerprinting."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "chromaprint-fpcalc-1.6.0-1.8.aarch64.rpm"
RPM_HASH = "ffb98a6ad320e7b3900fd0de1569dd1434a04ee616306fcdf9086ce47305220d8592edd7bf9ddd608c0bc34a278ee6ce607ac5c6f80dac590004ce9a173d8874"

RPROVIDES:${PN} += "chromaprint-fpcalc \
fpcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libchromaprint.so.1 \
libchromaprint1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libswresample.so.6"

inherit rpm
