SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "opencv-nogui-devel-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "795fef4a8ecd538935a8487ccd546a79ebb2370f6fd50844ee05f80c4410d306ce47dcabab19509aa5521d7a46c6784183e2dba85551445e4bf5e90cff2c3e10"

RPROVIDES:${PN} += "cmake-OpenCV \
opencv-nogui-devel \
pkgconfig-opencv4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv-aruco413 \
libopencv-face413 \
libopencv-gapi413 \
libopencv-imgcodecs413 \
libopencv-objdetect413 \
libopencv-optflow413 \
libopencv-superres413 \
libopencv-videoio413 \
libopencv-videostab413 \
libopencv-ximgproc413 \
libopencv413 \
opencv-nogui \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
