SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.5.0"

RPM_NAME = "libFLAC14-1.5.0-1.8.aarch64.rpm"
RPM_HASH = "f948df4e66ba43f68d497e12bf2b547e13d6a7029237f7b095749b255a35d0100d1a2ccb1627e85ae9c45fbbc6124e6cd41b0701ee6e2e98e83a6655b32d9f40"

RPROVIDES:${PN} += "libFLAC.so.14 \
libFLAC14 \
libflac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0"

inherit rpm
