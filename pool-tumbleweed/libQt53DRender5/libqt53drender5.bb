SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Render module contains functionality to support 2D and 3D \
rendering using Qt 3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DRender5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "c6fc3b734a15ca10acc23fed0f99ce7607f3731d1c0cf36addfb49da8910616ccda27fa83263613ac949edceda05d8052ff6a989bdbf8db25b9b4747a0a98fab"

RPROVIDES:${PN} += "libQt53DRender.so.5 \
libQt53DRender5 \
libQt53DRenderer5 \
libassimpsceneimport.so \
libdefaultgeometryloader.so \
libgltfgeometryloader.so \
libgltfsceneexport.so \
libgltfsceneimport.so \
libopenglrenderer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libassimp.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
