SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1a581a734ed7744ee9caa82884e08295692478f002fced9fa5eb2c5000bab142e5d485d19b45005afaa95079a54f606543e7360fd51b44d0ea7f29fe235a76ea"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticlesPrivate \
qt6-quick3dparticles-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6Quick3DAssetImportPrivate \
cmake-Qt6Quick3DParticles \
cmake-Qt6Quick3DPrivate \
cmake-Qt6Quick3DRuntimeRenderPrivate \
cmake-Qt6QuickPrivate"

inherit rpm
