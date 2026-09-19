SUMMARY = "Header files for ALSA development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.16.1"

RPM_NAME = "alsa-devel-1.2.16.1-2.1.aarch64.rpm"
RPM_HASH = "47fd2c09db5832051e76d0580199372510ac21a437e44984d4d43e738b0969f970c9f2b97f0a88989427b0921ebbf5a33a2d55b5e0907a10aa51a493c2125265"

RPROVIDES:${PN} += "alsa-devel \
alsa-lib-devel \
alsadev \
pkgconfig-alsa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libasound2"

inherit rpm
