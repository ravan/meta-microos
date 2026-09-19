SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv-gtk3-devel-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "5126270320c3cde79a28a00a6ae0b481f22824cf374ba25a7adaa3ca0f1623d1e53faae56f979df7d25437f5b283025eca90310527c6ac44c61f9b9d1f071e43"

RPROVIDES:${PN} += "cmake-OpenCV \
opencv-gtk3-devel \
pkgconfig-opencv4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv-aruco413 \
libopencv-face413 \
libopencv-gapi413 \
libopencv-highgui413-gtk3 \
libopencv-imgcodecs413 \
libopencv-objdetect413 \
libopencv-optflow413 \
libopencv-superres413 \
libopencv-videoio413 \
libopencv-videostab413 \
libopencv-ximgproc413 \
libopencv413 \
opencv-gtk3 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
