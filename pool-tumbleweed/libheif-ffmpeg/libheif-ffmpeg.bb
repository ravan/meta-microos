SUMMARY = "Plugin FFMPEG decoder (HW acc) for HEIC"
DESCRIPTION = "This plugin provides the FFMPEG decoder (HW acc) for HEIC to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-ffmpeg-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "da07cfc10f3f425a5517e4aad92f984b166e05b9740339ab56a3e87724efade616efb3db77d7769c0036d41539dac6b7b8b6307f39ef5ce76adeba079ac8983a"

RPROVIDES:${PN} += "libheif-ffmpeg \
libheif-ffmpegdec.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libstdc++.so.6"

inherit rpm
