SUMMARY = "Extra bootloaders for Raspberry Pi"
DESCRIPTION = "This package provides the console, experimental and debug \
firmware files for Raspberry Pi 4"
LICENSE = "SUSE-Firmware"

PV = "2026.02.11"

RPM_NAME = "raspberrypi-firmware-extra-pi4-2026.02.11-3.1.noarch.rpm"
RPM_HASH = "c46e288a453d0451d0b8fc12e2b3f786012dd2748001986aa898fbdd1131d9ca3ddf5441d265721852840505dc060bdfa32f6c2bc22762f0f7244cd3413a7447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-extra-pi4"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware \
util-linux"

inherit rpm
