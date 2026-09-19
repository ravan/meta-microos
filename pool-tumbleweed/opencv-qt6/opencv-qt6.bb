SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "opencv-qt6-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "db74edded34ca3c554ce7499e9c0404c91d706e7f9f990eab9f90bcc154b990bea7963052e4522d226e56ab2e98b76001708933861eb9d41eeddd022d7ff88c6"

RPROVIDES:${PN} += "opencv \
opencv-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-features2d.so.413 \
libopencv-highgui.so.413 \
libopencv-highgui413-qt6 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-objdetect.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
