SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "libSoundTouch1-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "02bd51aa1469f6c4cb2946d4034f1d328b611ba5ad56f6063c47a578fa35c218dc86a17666ec4abc1e14bdfb935cb16b3e1dd29f4cc05e79e92a68b6f90e6096"

RPROVIDES:${PN} += "libSoundTouch.so.1 \
libSoundTouch1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
