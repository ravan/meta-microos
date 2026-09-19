SUMMARY = "Qt 6 Quick3DPhysics library"
DESCRIPTION = "The Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DPhysics6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d9edbf9185cbfa7c2ff9a891f9b9cc7ce005322b8f3cc81e60bea11a8154d150eb3b38077d43f66c97ee5508603498c1f4fdcabb4b507b5114e9a4982ab4035f"

RPROVIDES:${PN} += "libQt6Quick3DPhysics.so.6 \
libQt6Quick3DPhysics6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
