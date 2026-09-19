SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kimageformats-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "87c5a797a17b519754a2fd1bae4cc1b20aa5b36d2a535fbacbd460c43068e4e556a3cf181f72508fe1548b563d7e4309ced52af3d6e4dabdc87792d106541647"

RPROVIDES:${PN} += "kimageformats"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libKF5Archive.so.5 \
libOpenEXR-3-4.so.33 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5PrintSupport5 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libraw.so.25 \
libstdc++.so.6"

inherit rpm
