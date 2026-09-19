SUMMARY = "The U-Boot firmware for the pine64plus platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pine64plus platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pine64plus-2026.07-2.1.aarch64.rpm"
RPM_HASH = "fbeed89a2ad96ff3e18f3ea855ee66984922910d37e137d5f50a0bce5b2d47029ffdb6c43354319fb0790fcc88d796819b582cad65758f493e80dec10f50d7a3"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pine64plus"

RDEPENDS:${PN} += ""

inherit rpm
