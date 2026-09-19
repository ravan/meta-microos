SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "opencv-gtk3-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "773fe3d8b4d15ddb43daf31d3d340cad934539e63d11119eb3450420523c59c36b10247972efdfaf9cb7c5d0c53d753427edadcd25700b8f97b36d7c68329547"

RPROVIDES:${PN} += "opencv \
opencv-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-features2d.so.413 \
libopencv-highgui.so.413 \
libopencv-highgui413-gtk3 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-objdetect.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
