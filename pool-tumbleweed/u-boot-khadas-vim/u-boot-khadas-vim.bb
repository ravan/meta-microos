SUMMARY = "The U-Boot firmware for the khadas-vim platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-khadas-vim-2026.07-2.1.aarch64.rpm"
RPM_HASH = "1c4f675d15029902192eb54066296e8acde9e5162cfa29334402f7d80d08c8e249051b377d95f33a5b167ccfbcc8eb078312acd3414b4b8cd82cec1d54d840ac"

RPROVIDES:${PN} += "u-boot-khadas-vim \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
