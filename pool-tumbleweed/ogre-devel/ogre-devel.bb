SUMMARY = "Development files for the Ogre Engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "05ed28bc5a254e9664b85b68afc096623e968f891e3efdd0472b142e96f793e2ebad4f9a06cf1a584ff877fa7ec8f250dc2d279736c54822b69972a1e4db23f7"

RPROVIDES:${PN} += "ogre-devel"

RDEPENDS:${PN} += "libOgreBites-devel \
libOgreMain-devel \
libOgreMeshLodGenerator-devel \
libOgreOverlay-devel \
libOgrePaging-devel \
libOgreProperty-devel \
libOgreRTShaderSystem-devel \
libOgreTerrain-devel \
libOgreVolume-devel"

inherit rpm
