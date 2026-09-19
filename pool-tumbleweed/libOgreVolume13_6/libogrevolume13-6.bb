SUMMARY = "Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains a component to render volumes. It can handle any volume \
data, but featurewise has a tedency towards terrains. The terrain aspect means \
that it is all about huge meshes being displayed with a level of detail \
mechanism. Thanks to volume rendering, caves, cliffes, holes and similar \
geometry can be displayed. \
 \
* Volume Rendering via Dual Marching Cubes. \
* LOD mechanism via a chunk tree and marching squares skirts for crack \
  patching. \
* Data Sources: 3D Textures with density values and the ability to buildup a \
  CSG Tree with 3D Textures, Spheres, Cubes, Planes, Intersection, Union, \
  Difference and Negation, SimplexNoise addition. \
* An own compressible file format for discrete density values."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreVolume13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "071cc9878b82ecf4c23744d7efe596ac61f5f43c34880ed2360bf4a54dac952eba1a679357b635a1fe40a16a7c9377aa1a97a76d2593a2638fdc8a9ab25b26df"

RPROVIDES:${PN} += "libOgreVolume.so.13.6 \
libOgreVolume13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
