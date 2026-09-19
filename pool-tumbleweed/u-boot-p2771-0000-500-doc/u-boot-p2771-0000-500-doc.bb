SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-p2771-0000-500-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c60a86d7687e11037597d4e7ae49d897db397c50d4c5a2563a4457f304a82486267cca0d9a9a7accce8beb608c3b33f3350467ea596f33b3133a7cc46084ae7e"

RPROVIDES:${PN} += "u-boot-p2771-0000-500-doc"

RDEPENDS:${PN} += ""

inherit rpm
