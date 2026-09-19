SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv-qt6-devel-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "31807f272da1c99547eb7cc1eb41972645130f793b8c024abd3baa5f004dbc2dff21b7b89f83f36c6a4cae94d52eb66d481a56eaf124eca1a51e03b7ad3b3450"

RPROVIDES:${PN} += "cmake-OpenCV \
opencv-qt6-devel \
pkgconfig-opencv4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv-aruco413 \
libopencv-face413 \
libopencv-gapi413 \
libopencv-highgui413-qt6 \
libopencv-imgcodecs413 \
libopencv-objdetect413 \
libopencv-optflow413 \
libopencv-superres413 \
libopencv-videoio413 \
libopencv-videostab413 \
libopencv-ximgproc413 \
libopencv413 \
opencv-qt6 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
