SUMMARY = "The U-Boot firmware for the orangepizero2w platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepizero2w platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepizero2w-2026.07-2.1.aarch64.rpm"
RPM_HASH = "876575be963121bdb872fda40c610bccb4cb2d8c0b9d5e3b2e0ad6d29909aa62860986aa5e8aa27b5e6aee99d0eaf47211f7feb116b726cfb59531fe8e2f6878"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepizero2w"

RDEPENDS:${PN} += ""

inherit rpm
