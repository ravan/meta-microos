SUMMARY = "Optical flow calculation libraries for OpenCV"
DESCRIPTION = "Optical flow calculation libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_optflow413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "a8d79b7ccf0f998087b2be0034819bc138b7727416eb34793f114b494444ebf8c546e52346c6b9ce2c034f582d6b45d314d86d0f10dc5b7109f2d81ecbc1c1b1"

RPROVIDES:${PN} += "libopencv-optflow.so.413 \
libopencv-optflow413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-flann.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-video.so.413 \
libopencv-ximgproc.so.413 \
libstdc++.so.6"

inherit rpm
