SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-opengl-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "068a6a95ba4e7e79191f766d95dc5864ba8bad8abf7e072ffda1a64e563cce52f6ee56cb3d16eacdbfa6a1a74248e57969bd7dba6d9db7a20f98ec66c0475c4a"

RPROVIDES:${PN} += "cmake-Qt6OpenGL \
pkgconfig-Qt6OpenGL \
qt6-opengl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6Core \
cmake-Qt6Gui \
libQt6OpenGL6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-glesv2"

inherit rpm
