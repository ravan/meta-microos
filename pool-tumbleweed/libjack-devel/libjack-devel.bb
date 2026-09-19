SUMMARY = "Development package for jack"
DESCRIPTION = "This package contains the files needed to compile programs that \
communicate with jack clients/servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack-devel-1.9.22-5.5.aarch64.rpm"
RPM_HASH = "bd558d79de5e8b0256adffce46551cb4a13f43fed1619deb83bd2b10af19b8bbf3971eea634ac65fca9abb1ddebdcf251aa919f66051ebd2914bb8e35b1ef71c"

RPROVIDES:${PN} += "jack-audio-connection-kit-devel \
jack-devel \
libjack-devel \
libjack2-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjack0 \
libjacknet0 \
libjackserver0 \
pkgconfig"

inherit rpm
