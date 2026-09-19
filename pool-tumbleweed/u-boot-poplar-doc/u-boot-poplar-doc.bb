SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-poplar-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "4679feaf6e470e6a0b8bd8353dbdfdc1c9350ea1f9f0f1b9379177769122d2ee13ee4eb10c8d9e106593cfea8f3976bb751b60d7f6f86658658aad7ccfceb421"

RPROVIDES:${PN} += "u-boot-poplar-doc"

RDEPENDS:${PN} += ""

inherit rpm
