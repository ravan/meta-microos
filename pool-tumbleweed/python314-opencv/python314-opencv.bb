SUMMARY = "Python 3.14 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3.14 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "python314-opencv-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "1dfe014f96d4b240addcde9d2bc219ea9a8c8f2f03a96a8759409fd95419c87d7ec6d6e7b555b9996ae1f44d2626c10691cbd1cc746013b564774035159e768f"

RPROVIDES:${PN} += "python314-opencv"

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
python-abi"

inherit rpm
