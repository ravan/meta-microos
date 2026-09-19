SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_highgui413-qt6-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "7734a614e9f1158bbfad056dadf604f73077d3fdb1cbffa9f674f8a7ba914580872706e25d6f32da6e8ed9e5e495c9964e4a21adb30e56f69c2458a69939c300"

RPROVIDES:${PN} += "libopencv-highgui.so.413 \
libopencv-highgui413-qt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Test.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6"

inherit rpm
