SUMMARY = "API for creating 3D content and 3D user interfaces based on Qt Quick"
DESCRIPTION = "Qt Quick 3D provides a high-level API for creating 3D content and 3D user \
interfaces based on Qt Quick."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b86d4c3b52f0886f5e8ffc16086ce98fa0df83a33a971f942ce69f3ee31d6d5b2ba224b25c1f5c33464cdeb157c63feb7513a90db95d03363c44efc5e67f7f23"

RPROVIDES:${PN} += "libassimp.so \
qt6-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DParticles.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6ShaderTools.so.6 \
libQt6Widgets.so.6 \
libassimp.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
