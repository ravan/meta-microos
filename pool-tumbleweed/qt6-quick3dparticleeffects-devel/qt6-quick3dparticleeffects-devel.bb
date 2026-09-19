SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "308dda8dc26912c2c73c89be1bf12e6fbb8c976c52b207f847d42bbb3ae93c34340e32bf47e9fd7fef1e6259174a3d25992ea1ff2ce6072a2a06e34379512eef"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticleEffects \
pkgconfig-Qt6Quick3DParticleEffects \
qt6-quick3dparticleeffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DParticleEffects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DParticles \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
