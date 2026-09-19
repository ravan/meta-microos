SUMMARY = "Qt 6 3DRender library"
DESCRIPTION = "The Qt 6 3DRender library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DRender6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ff76a42b8f277519b71b754d696af7c1d616f1dbfd6f1edbcf43aa7182a2f7e38cc34234822393856d54b200228ed8136f3340c7602ad6bcfe3214ceea7715d5"

RPROVIDES:${PN} += "libQt63DRender.so.6 \
libQt63DRender6 \
libassimpsceneimport.so \
libdefaultgeometryloader.so \
libgltfgeometryloader.so \
libgltfsceneexport.so \
libgltfsceneimport.so \
libopenglrenderer.so \
librhirenderer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6ShaderTools.so.6 \
libassimp.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
