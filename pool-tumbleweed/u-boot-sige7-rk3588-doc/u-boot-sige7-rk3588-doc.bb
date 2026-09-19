SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-sige7-rk3588-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "e6b1b00c584ee20c51c947b491d3a0b442899a3ff3c8fba87b96a1fdbd6adffac1d3f484f8cb468c6e5a0b304e0a8759b0d96be8308a5dd49c39e8a9e12c5b37"

RPROVIDES:${PN} += "u-boot-sige7-rk3588-doc"

RDEPENDS:${PN} += ""

inherit rpm
