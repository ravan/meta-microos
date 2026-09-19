SUMMARY = "Command line module player"
DESCRIPTION = "This package contains the openmpt123 command-line module player."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "openmpt123-0.8.9-1.1.aarch64.rpm"
RPM_HASH = "df4329c4d46c7f5566766038aaf8b23911ebe1b0ffb08b694972b5ee8853e16ae45ea8e6bc808db37c72430d8fafd1f2f1864ab6f7afd3444d34de93d1bd7996"

RPROVIDES:${PN} += "openmpt123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenmpt.so.0 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
