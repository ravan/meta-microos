SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebudbarmada8k-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "5edf7d34525c1d8adf8291022f27d5c46f36b33c2326bae6882abca367da181f336c5bd4dd64ae2b8452c4eb2a3777bea9d0dee449391a1c0705f14bd20e7b36"

RPROVIDES:${PN} += "u-boot-mvebudbarmada8k-doc"

RDEPENDS:${PN} += ""

inherit rpm
