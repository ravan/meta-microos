SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "libSoundTouchDll1-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "fbad477887f0a9baf492e4bd8e8b3733b1e837836d1b9f0f763292f254775c6dd963df5290e494ef7595108dc2b9234dc667356b4c8bc3c3363bbbed96372073"

RPROVIDES:${PN} += "libSoundTouchDll.so.1 \
libSoundTouchDll1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
