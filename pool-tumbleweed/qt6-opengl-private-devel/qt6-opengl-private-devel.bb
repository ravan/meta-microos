SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-opengl-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d846627b6f310efa6913485d1b32c45dd45c805da52413c6de2d67c5c95ac917a8d52024973581ed11e24256a1480405b54688f0a714724ebd2bb3e571d9fa9c"

RPROVIDES:${PN} += "cmake-Qt6OpenGLPrivate \
qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6OpenGL"

inherit rpm
