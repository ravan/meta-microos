SUMMARY = "The U-Boot firmware for the rpi4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi4 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpi4-2026.07-2.1.aarch64.rpm"
RPM_HASH = "05588f0a1443a09842441b0d7f9e220f81b2574bb911c1ce777a83d6a5475ef5fe69a389010233cc4ca78d2d2361ad69a98fa751e744c9322f4d9fa6edd88bf6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
