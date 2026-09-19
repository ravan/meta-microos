SUMMARY = "The U-Boot firmware for the orangepi-3b-rk3566 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepi-3b-rk3566 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepi-3b-rk3566-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c8b96c23a93e361c77c973944350405d636c93031534a5bc85d9d433f7b576458920d431fc8a751b44487e47d24d01b4d6c2bf347dccef83db05eb42cfe0bb62"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepi-3b-rk3566"

RDEPENDS:${PN} += ""

inherit rpm
