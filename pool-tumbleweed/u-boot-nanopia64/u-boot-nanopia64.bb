SUMMARY = "The U-Boot firmware for the nanopia64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopia64 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopia64-2026.07-2.1.aarch64.rpm"
RPM_HASH = "1f4af117da4a680babb948aaff3983a9c28dabe111756b1283206dc023edc51e400ca7c7e6e158c514ae8ab9b52d9be86ccc38190a27fbf88856abd17fc0dae6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopia64"

RDEPENDS:${PN} += ""

inherit rpm
