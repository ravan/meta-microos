SUMMARY = "Development files for the SoundTouch audio processing library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other. \
 \
This subpackage contains the header files for building programs with \
SoundTouch."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "soundtouch-devel-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "cd587f387b2354480dceb6c3d262a9c884941d372d1fe7274ec2c91a3899ace9f1b272d24e2af79641facafe5a4f374b4a1b0fa6b10735a7245f2bdeb8723d76"

RPROVIDES:${PN} += "pkgconfig-soundtouch \
soundtouch-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libSoundTouch1"

inherit rpm
