SUMMARY = "Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-demos-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "68c42ff0ffb15e25b9e302847e48eadebb2271b9cff766642eba1ef2f4143bcb4f8a4759af99c5f561ef45aa8b63563a5e48293ce7e163f93a365e7c943fbdb2"

RPROVIDES:${PN} += "ogre-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreBites.so.13.6 \
libOgreMain.so.13.6 \
libOgreMain13-6-plugins \
libOgreMeshLodGenerator.so.13.6 \
libOgreOverlay.so.13.6 \
libOgrePaging.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libOgreTerrain.so.13.6 \
libOgreVolume.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ogre-media"

inherit rpm
