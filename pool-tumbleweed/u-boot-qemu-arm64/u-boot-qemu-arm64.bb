SUMMARY = "The U-Boot firmware for the qemu-arm64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the qemu-arm64 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-qemu-arm64-2026.07-2.1.aarch64.rpm"
RPM_HASH = "f6aaa4220f69d61f8db29a8139d4a93f3c398b41be923b57c713b20e488b0b7baead8bc9b136ef18d9114ba7202756db2f5433dfab24d235029b3d205d34c88e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-qemu-arm64"

RDEPENDS:${PN} += ""

inherit rpm
