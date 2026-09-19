SUMMARY = "Binary bootloader and firmware files for Raspberry Pi"
DESCRIPTION = "Binary bootloader and firmware files for Raspberry Pi"
LICENSE = "SUSE-Firmware"

PV = "2026.02.11"

RPM_NAME = "raspberrypi-firmware-2026.02.11-3.1.noarch.rpm"
RPM_HASH = "9237deda06c0d006294a4fca98c2832a7e6fe69445f200507e56f3a2251ba24d54f11d70b2183861e7e28670c077f3bad5510331c8ae078a313e9e7575f5264f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
