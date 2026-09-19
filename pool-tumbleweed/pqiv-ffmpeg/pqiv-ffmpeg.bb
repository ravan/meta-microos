SUMMARY = "Backend ffmpeg/libav for pqiv"
DESCRIPTION = "Backend ffmpeg/libav for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-ffmpeg-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "331701be5d6b6ac1794a40d8858990bb8cca1390b0ccece4734b9d4e9f7207c79a1335734ea0189270d3af2efda49a06a41df0ae41374c9708cd476b7f7c31b9"

RPROVIDES:${PN} += "pqiv-ffmpeg"

RDEPENDS:${PN} += "libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libswscale.so.9 \
pqiv"

inherit rpm
