SUMMARY = "Shared library containing the QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is not a program, but a feature-rich Qt/OpenGL-based C++ \
programming library. It provides essentially a bunch of 3D widgets \
for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "libqwtplot3d-qt5-0-0.2.7+git20190410.a6d0890d-2.9.aarch64.rpm"
RPM_HASH = "f6e9078c2c2242d5c0cbf53cd0ce3b90acd73fa5c510f448dce4e59b93e51996bb4d00bd4d742e46112c0bcb85437f43a134b7699091e23ce71daab1928ace75"

RPROVIDES:${PN} += "libqwtplot3d-qt5-0 \
libqwtplot3d-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
