SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMain13_6-plugins-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "53b332ff21994e052b0d48e06d23fef115b18a3b81ba3ea74766218202425e85c81615cef6bcbdf940ddfb951f656e23cc6b01e4fdf3475f38518ebb1e3eb959"

RPROVIDES:${PN} += "libOgreMain-plugins \
libOgreMain13-6-plugins"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOgreMain.so.13.6 \
libOgreTerrain.so.13.6 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.16 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
