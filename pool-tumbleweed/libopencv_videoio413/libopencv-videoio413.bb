SUMMARY = "Video IO libraries for OpenCV"
DESCRIPTION = "Video IO libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_videoio413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "a9b7fcae5887b88d1207e0bec5b4879fc7e683142858a220e65002639cd6d0aa2d6e4ac95a7e649087e5c91b14fc436b521642ccdd5fc6370ecf616a668e5c8c"

RPROVIDES:${PN} += "libopencv-videoio.so.413 \
libopencv-videoio413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6 \
libswscale.so.9"

inherit rpm
