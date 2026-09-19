SUMMARY = "A52 Output Plug-In for ALSA Library"
DESCRIPTION = "This package contains the A52 (aka AC3) output plug-in for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-a52-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "aa6c209f651a28ed52e70964a7ce720e156d82c8cae8e6ddc64f2dfdc5cefb4ee9010cc2a307e4d2287ea8f2dd2c8930c10080c5b6e73f6c449d411581bd95ef"

RPROVIDES:${PN} += "alsa-plugins-a52 \
libasound-module-pcm-a52.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6"

inherit rpm
