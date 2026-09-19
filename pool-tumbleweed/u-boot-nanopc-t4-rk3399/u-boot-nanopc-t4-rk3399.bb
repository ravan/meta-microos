SUMMARY = "The U-Boot firmware for the nanopc-t4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopc-t4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopc-t4-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "59bf35fd9a54b2403364196c3aad35f6b146e6c509d52ffdd40d4e1f28b849628e803ef530c44ab5d08fd390dfbaf6642f66241e4859b26d78b6393de9b80e8e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopc-t4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
