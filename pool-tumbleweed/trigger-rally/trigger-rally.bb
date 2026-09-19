SUMMARY = "Fast-paced single-player rally racing game"
DESCRIPTION = "A 3D rally simulation with a physics engine for drifting, over 100 maps, \
different terrain materials like dirt, asphalt, sand, ice etc. and various \
weather, light and fog conditions. Most maps are equipped with spoken co-driver \
notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.7"

RPM_NAME = "trigger-rally-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "08e5f4e08dd8f0c73bb55d44780cefb46809c55a6c5f4eabde19bf1571f00f9a39ba509be378b7a3eeae8ad1d45c486bfcb878595de6c69dcf72d05c0e549eac"

RPROVIDES:${PN} += "trigger-rally"

RDEPENDS:${PN} += "libGL.so.1 \
libGLEW.so.2.3 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libphysfs.so.1 \
libstdc++.so.6 \
libtinyxml2.so.11 \
trigger-rally-data"

inherit rpm
