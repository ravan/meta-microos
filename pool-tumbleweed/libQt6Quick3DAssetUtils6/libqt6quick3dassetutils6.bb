SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d910a0559f1f170548dd41c0be487a389d99f8a79d62b6a0c5a17eff1e7329b7dacd65576352b7340183c9670a02c9086935056e084560774dba0fe7557168da"

RPROVIDES:${PN} += "libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DAssetUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6QuickTimeline.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
