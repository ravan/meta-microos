SUMMARY = "Video stabilization libraries for OpenCV"
DESCRIPTION = "Video stabilization libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_videostab413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "a398f6533dcfc5a75c0d87e4ac79b2f3cd27c5f17894ead5814e3ead7b76ce6d2620d858fecd4ffd284616a3ede0125fa2ef22274c3fb819e60022eac05254cd"

RPROVIDES:${PN} += "libopencv-videostab.so.413 \
libopencv-videostab413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-features2d.so.413 \
libopencv-imgproc.so.413 \
libopencv-photo.so.413 \
libopencv-video.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
