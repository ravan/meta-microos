SUMMARY = "Libraries to use OpenCV computer vision"
DESCRIPTION = "The Open Computer Vision Library is a collection of algorithms and sample code \
for various computer vision problems. The library is compatible with IPL and \
utilizes Intel Integrated Performance Primitives for better performance."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "bcfade3e71b4e4e9d4047566e814fdcac857123a2f1c3bee2a922d18f5cb8e0e15bb7ecc7625259139ace7cf7baaa6a0edfaa6b9b66523a8b82875880061ecd5"

RPROVIDES:${PN} += "libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-features2d.so.413 \
libopencv-flann.so.413 \
libopencv-imgproc.so.413 \
libopencv-ml.so.413 \
libopencv-photo.so.413 \
libopencv-plot.so.413 \
libopencv-shape.so.413 \
libopencv-stitching.so.413 \
libopencv-tracking.so.413 \
libopencv-video.so.413 \
libopencv413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
