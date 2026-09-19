SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_highgui413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "724b4f993b239c6cc91a558b12b349277b7c1bf331c59baba74993f0f2b81e69fe9cb7e771e50cf67d8d101b1233aad12668f4def42cc0b5778c18b8220df387"

RPROVIDES:${PN} += "libopencv-highgui.so.413 \
libopencv-highgui413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6"

inherit rpm
