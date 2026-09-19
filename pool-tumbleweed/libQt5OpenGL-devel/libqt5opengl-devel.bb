SUMMARY = "Development files for the Qt5 OpenGL library"
DESCRIPTION = "Development files for the Qt5 OpenGL library. \
 \
Warning: This module should not be used anymore for new code. Please \
use the corresponding OpenGL classes in Qt GUI."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5OpenGL-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "c168d427d42957a2d7ceec506c791b763145c202c4762e5110338bbac42ca21ebec3b7d0a379d39fb0a36fe0035f574c29a667027fc3182a8e70edf04a90eec0"

RPROVIDES:${PN} += "cmake-Qt5OpenGL \
libQt5OpenGL-devel \
pkgconfig-Qt5OpenGL"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
libQt5OpenGL5 \
libQt5Widgets-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-glesv2"

inherit rpm
