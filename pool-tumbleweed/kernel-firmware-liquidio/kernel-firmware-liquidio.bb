SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains kernel firmware files for Cavium LiquidIO driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-liquidio-20260610-1.2.noarch.rpm"
RPM_HASH = "8fc4ef84ee77ec186a943ac9f27f79c96f69f51ff6234775d985501f247b2d2e1bb49aa5eab0339a4d701f35345f0b9aca1c4614712267747ba0ceccd81d1111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-liquidio/lio-210nv-nic.bin \
firmware-liquidio/lio-210sv-nic.bin \
firmware-liquidio/lio-23xx-nic.bin \
firmware-liquidio/lio-410nv-nic.bin \
kernel-firmware-liquidio"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
