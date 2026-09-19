SUMMARY = "The U-Boot firmware for the odroid-n2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-n2 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-n2-2026.07-2.1.aarch64.rpm"
RPM_HASH = "a66be7cefc11b93d66c1bababa08f689455235327768bca527ac069552b0341d008c2e491f678f26aaf04a5e182503653663ef73a010ab6c036ad0b34f038848"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-n2"

RDEPENDS:${PN} += ""

inherit rpm
