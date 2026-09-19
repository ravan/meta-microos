SUMMARY = "Development headers for Mesh LOD"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMeshLodGenerator-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "a92bb1d22ab8094058076b7132d24abc038354aa14d364b770e50db6c62005aeaaee1e509919f510de74f297e765488eee26f334201b5aa800672227fa9cf222"

RPROVIDES:${PN} += "libOgreMeshLodGenerator-devel \
pkgconfig-OGRE-MeshLodGenerator"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMeshLodGenerator13-6 \
pkgconfig-OGRE"

inherit rpm
