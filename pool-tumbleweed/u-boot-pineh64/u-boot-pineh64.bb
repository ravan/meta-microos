SUMMARY = "The U-Boot firmware for the pineh64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pineh64 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pineh64-2026.07-2.1.aarch64.rpm"
RPM_HASH = "0affd217435fb3117f333068b1ed2ff9775eb8b7daf81e320e790aa9efd0efefa2d454e04ca074dc2c8fc529f7471d4921d1e4efeb96863bf66885af5e4f5bc4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pineh64"

RDEPENDS:${PN} += ""

inherit rpm
