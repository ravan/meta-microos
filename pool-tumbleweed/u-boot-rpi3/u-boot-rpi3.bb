SUMMARY = "The U-Boot firmware for the rpi3 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi3 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpi3-2026.07-2.1.aarch64.rpm"
RPM_HASH = "ca24e70eb023b5be69474559c51d18737a95780cb737e925158de24828ab068a239ca539e5668a872079565f1b08447f218ed8a847d24f94f5567f4ffb243092"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
