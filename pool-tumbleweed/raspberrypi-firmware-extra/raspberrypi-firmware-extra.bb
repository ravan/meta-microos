SUMMARY = "Extra bootloaders for Raspberry Pi"
DESCRIPTION = "This package provides the console, experimental and debug \
firmware files for Raspberry Pi"
LICENSE = "SUSE-Firmware"

PV = "2026.02.11"

RPM_NAME = "raspberrypi-firmware-extra-2026.02.11-3.1.noarch.rpm"
RPM_HASH = "ff3351778cb1d9220dfd7bcddffa8947eb4f37e8749f6f6340c2e69aa2e894477bc8cacd1c044006b86cacef42cb2d3991b2b908fa2f57be90b00b57f1827863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware \
util-linux"

inherit rpm
