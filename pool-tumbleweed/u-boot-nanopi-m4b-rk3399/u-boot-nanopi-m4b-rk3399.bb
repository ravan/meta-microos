SUMMARY = "The U-Boot firmware for the nanopi-m4b-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopi-m4b-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "8ae23a4e2275c615fef32ce81574e828b16ed46bca889a66f39385f0ef636514e2b29b1b61c149c9e70631d759566a1b931da6d8e6c82d416410db9683e5ffea"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopi-m4b-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
