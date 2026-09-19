SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-hikey-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "fab2e327c18f6a0fcb05d0da5c0e57d97f96f46014a0a5758de7155c33492c948bf581769ca679f927288a4c9eb384104a165e4fce2a7d76b4bcd48018852345"

RPROVIDES:${PN} += "u-boot-hikey-doc"

RDEPENDS:${PN} += ""

inherit rpm
