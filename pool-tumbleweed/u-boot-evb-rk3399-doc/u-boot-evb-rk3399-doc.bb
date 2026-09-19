SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-evb-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c219a2704c3f3141ecc10b41866c1a588867d6b1f7f214d194e6a9cb6398b8d7195686f9785ad54892520939b1cbc0b82e16ce452ec64a8aea1b318c143e4227"

RPROVIDES:${PN} += "u-boot-evb-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
