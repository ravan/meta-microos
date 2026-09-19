SUMMARY = "Audio watermarking"
DESCRIPTION = "audiowmark is an open source solution for watermarking audio files. It is is \
designed to be robust, fast, secure, and to produce a a watermark is not audible \
for most users."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.5"

RPM_NAME = "audiowmark-0.6.5-1.8.aarch64.rpm"
RPM_HASH = "15c1af3d1a3c9fbca9d16ea6ab7e0ba50ae0be2e5295719e0441688a6b0ea16a40face04a746e18e2088bb2b98226cfc391026b8d53d98fea9954e9d161a5b90"

RPROVIDES:${PN} += "audiowmark"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libm.so.6 \
libmpg123.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libswresample.so.6 \
libzita-resampler.so.1"

inherit rpm
