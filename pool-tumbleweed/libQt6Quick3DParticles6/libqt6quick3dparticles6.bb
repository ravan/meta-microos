SUMMARY = "Qt 6 Quick3DParticles library"
DESCRIPTION = "The Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DParticles6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ff834a6a3311075d9af7ae08bfbe1c5f3e69b072ccefc0d2eb51a3c3f4ba3523554e05803da20d156fb2bc7aa2e74b6aa7d73ccd00447f5e23eacc4cad667f2c"

RPROVIDES:${PN} += "libQt6Quick3DParticles.so.6 \
libQt6Quick3DParticles6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
