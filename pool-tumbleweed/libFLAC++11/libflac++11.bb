SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C++ API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.5.0"

RPM_NAME = "libFLAC++11-1.5.0-1.8.aarch64.rpm"
RPM_HASH = "d8f0af45243aa18e6c2f0315d1965fbe5f059d14da3b767db87198c3ca3ae2ca09e117eea93387989d98de9d0a1678aef401ff47bdd5a6fa6747574f4d4fd70f"

RPROVIDES:${PN} += "libFLAC++.so.11 \
libFLAC++11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
