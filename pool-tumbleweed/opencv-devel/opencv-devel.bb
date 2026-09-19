SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv-devel-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "98279518f434bd93f412d99dcc004e2d917331bc2c7b073681aea1656a7626429fc94fb4700f2b22f9c0699cfeeed2fe694e1e9c40f4bbc013993c4cc952f327"

RPROVIDES:${PN} += "cmake-OpenCV \
opencv-devel \
opencv-qt5-devel \
pkgconfig-opencv4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv-aruco413 \
libopencv-face413 \
libopencv-gapi413 \
libopencv-highgui413 \
libopencv-imgcodecs413 \
libopencv-objdetect413 \
libopencv-optflow413 \
libopencv-superres413 \
libopencv-videoio413 \
libopencv-videostab413 \
libopencv-ximgproc413 \
libopencv413 \
opencv \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
