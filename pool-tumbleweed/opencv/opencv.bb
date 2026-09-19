SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "opencv-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "bfca1a6c04a1fb5fc6ce2fe22540545eb3aed56182263322571e613fb09ad019f1e80d8c9276c9b14bbfbf36b29330fbfa5ecaebcd2a33c7ae79e7ea3526601a"

RPROVIDES:${PN} += "opencv \
opencv-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-features2d.so.413 \
libopencv-highgui.so.413 \
libopencv-highgui413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-objdetect.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
