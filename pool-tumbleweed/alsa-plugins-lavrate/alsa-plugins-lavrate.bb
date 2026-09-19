SUMMARY = "Rate Converter Plug-In for ALSA Library using libavcodec"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libavcodec."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-lavrate-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "a4c1cd51f457e70b013789370e3117c19a3a7184dbfdea599aaa59bc44684ab5b78b9d49a99d26949d848d3ebd6ee39487f622963cdd3d9af2d5e1f6aa0e5dd1"

RPROVIDES:${PN} += "alsa-plugins-lavcrate \
alsa-plugins-lavrate \
libasound-module-rate-lavrate.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavutil.so.60 \
libc.so.6 \
libswresample.so.6"

inherit rpm
