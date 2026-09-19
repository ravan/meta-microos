SUMMARY = "The U-Boot firmware for the pinebook-pro-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook-pro-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinebook-pro-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "75e325fe0e4e53c71ae432261a3790910508e4247bed974580c2cbf04ee2245247e0d02e9c8f13bff33be264d67e23969bb71f686fcad043240b90ac8c18b618"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook-pro-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
