SUMMARY = "Qt OpenGLExtensions module"
DESCRIPTION = "Qt OpenGLExtensions module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5OpenGLExtensions-devel-static-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "c005964a6ac3e429458fcde7f1edfa348e4fdf001d0e67244a949149aa7e0c92d365c02772b2d2be0ada87f8126c4f102fe5f45ad799485feca4ab0ccc46056d"

RPROVIDES:${PN} += "cmake-Qt5OpenGLExtensions \
libQt5OpenGLExtensions-devel-static \
pkgconfig-Qt5OpenGLExtensions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-gl"

inherit rpm
