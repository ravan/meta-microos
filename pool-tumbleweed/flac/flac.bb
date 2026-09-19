SUMMARY = "Free Lossless Audio Codec"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. Digital audio compressed by FLAC's \
algorithm can typically be reduced to between 50 and 70 percent of \
its original size, and decompresses to an identical copy of the \
original audio data."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.5.0"

RPM_NAME = "flac-1.5.0-1.8.aarch64.rpm"
RPM_HASH = "cf47c7f1b837e57bec11c5543446db80dd0c7197f6df6ff909ddb908449b30fe3d2f17b2c76ef868e77fdd543d21961503da4b32cc4ed9836b29499d168fe8b2"

RPROVIDES:${PN} += "flac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libm.so.6"

inherit rpm
