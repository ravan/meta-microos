SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kimageformats-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0784545c10a735f4ea7e2fc350921e1180dd9e232e04b7933a3e65c8ee9bb291fb1405514edd7949db36b9620fe0a5688add1fd7b1d9b0f7b6cfdff6f584f261"

RPROVIDES:${PN} += "kf6-kimageformats"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libKF6Archive.so.6 \
libOpenEXR-3-4.so.33 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libjxl-cms.so.0.11 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libopenjp2.so.7 \
libraw.so.25 \
libstdc++.so.6 \
qt6-imageformats"

inherit rpm
