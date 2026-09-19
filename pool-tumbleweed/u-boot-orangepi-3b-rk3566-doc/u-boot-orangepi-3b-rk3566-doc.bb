SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepi-3b-rk3566-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "56a11f8cd3f31aab5f8fd0b5415d7c93084a255eb819c37d9c2801761b65835f52180c48573acf6c908910e33735378217536d09f92e64a5a0da929bf01070f1"

RPROVIDES:${PN} += "u-boot-orangepi-3b-rk3566-doc"

RDEPENDS:${PN} += ""

inherit rpm
