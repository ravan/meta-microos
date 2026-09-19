SUMMARY = "Device trees for the Raspberry Pi firmware loader"
DESCRIPTION = "This package provides additional device tree base files as well as overlays \
for the Raspberry Pi boot process."
LICENSE = "GPL-2.0-only"

PV = "2025.05.14"

RPM_NAME = "raspberrypi-firmware-dt-2025.05.14-10.2.noarch.rpm"
RPM_HASH = "1357cb2e2b032f996f8c62d2e697e9187735f66c91fd8bdf8bf98e69defa2b807a7d584ce5625fa4d76755d8d09a94b1a3ff149cf9c3f987394cfdd690ed5ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-dt"

RDEPENDS:${PN} += "/usr/bin/sh \
kernel \
raspberrypi-firmware"

inherit rpm
