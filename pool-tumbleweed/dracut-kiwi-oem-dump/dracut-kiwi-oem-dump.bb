SUMMARY = "KIWI - Dracut module for oem(install) image type"
DESCRIPTION = "This package contains the kiwi-dump and kiwi-dump-reboot dracut \
modules which is used to install an oem image onto a target disk. \
It implements a simple installer which allows for user selected \
target disk or unattended installation to target. The source of \
the image to install could be either from media(CD/DVD/USB) or \
from remote"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-oem-dump-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "c8b80e5bc94891a72ad8ac3b905f7fe8ca6b2c321cd8df36b110fd4918f124890c737a792144353f5d7db95461bca09e239f6d9e7cf53279637f99e56b6adde7"

RPROVIDES:${PN} += "dracut-kiwi-oem-dump"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib \
gawk \
kexec-tools \
kpartx"

inherit rpm
