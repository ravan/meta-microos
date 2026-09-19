SUMMARY = "Video thumbnail generator"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "libffmpegthumbnailer4-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "68c15292964d6cc9812a2aa576338df2525f0b929f0fa6c9fafe2709b5fb3047f9dc3df39f0c1c5aa97392ae5e168120ddf25db1be5861e8d96eb1d723caef30"

RPROVIDES:${PN} += "libffmpegthumbnailer.so.4 \
libffmpegthumbnailer4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
