SUMMARY = "Qt 6 Quick3DHelpers library"
DESCRIPTION = "The Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DHelpers6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "529d960b130cfac2fcefcf480cfe6f20bf7a133a34c336fb175d627d66d88691dc20d1144aa0f6d5008ad01445afcf9b6d917071c45986225bf80a6708c3c782"

RPROVIDES:${PN} += "libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
