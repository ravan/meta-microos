SUMMARY = "Python 3.13 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3.13 bindings for the OpenCV library. \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
Provides:       opencv = 4.13.0"
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "python313-opencv-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "db3a5b864933bc1039bdb9a5d9a6860fb4cf98a35c635bd8dd8c70df16388b4c688d1a7ed8464645196a65d42a3f0cd3c2561a1d45a7344c8e8b901b57583d0a"

RPROVIDES:${PN} += "python3-opencv \
python3-opencv-qt5 \
python313-opencv \
python313-opencv-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-aruco.so.413 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-face.so.413 \
libopencv-features2d.so.413 \
libopencv-flann.so.413 \
libopencv-gapi.so.413 \
libopencv-highgui.so.413 \
libopencv-highgui413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-ml.so.413 \
libopencv-objdetect.so.413 \
libopencv-optflow.so.413 \
libopencv-photo.so.413 \
libopencv-plot.so.413 \
libopencv-shape.so.413 \
libopencv-stitching.so.413 \
libopencv-tracking.so.413 \
libopencv-video.so.413 \
libopencv-videoio.so.413 \
libopencv-ximgproc.so.413 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
