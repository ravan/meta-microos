SUMMARY = "Glide64mk2 Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Glide64mk2 Video Plugin for the Mupen64plus \
Nintendo 64 Emulator which provides high-level graphics emulation."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-plugin-video-glide64mk2-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "0d8156faa45432f8264269e943575a14be061ec0b65bf1fc0995bd6916b3be3f781c0a4a5329435ca4216dfd2deb4fb2d29b14ff888f4bf13078e08ddb7fbf8c"

RPROVIDES:${PN} += "mupen64plus-plugin-video \
mupen64plus-plugin-video-glide64mk2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
