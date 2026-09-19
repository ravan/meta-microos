SUMMARY = "Qt5 Quick3D Library"
DESCRIPTION = "Qt Quick 3D is a high level 3D API for Qt Quick. \
Qt Quick 3D enables anyone to introduce 3D content into their Qt Quick \
applications. Rather than requiring the end user to know advanced details of \
the graphicsrendering pipeline (building framegraphs and materials), \
it is now possible to simply build up a 3D scene using high level primitives."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libQt5Quick3D5-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "8238b812d3ac4deda60f586f34528307c1b8748163e64a09c6b1c73cc6ad6d0559e58ad33dc3ca7e4cd5f9e010a1b2de35fe0e834f0b3143d92782415af410f5"

RPROVIDES:${PN} += "libQt5Quick3D.so.5 \
libQt5Quick3D5 \
libQt5Quick3DRender.so.5 \
libQt5Quick3DRuntimeRender.so.5 \
libQt5Quick3DUtils.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libQt5Quick3DAssetImport.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
