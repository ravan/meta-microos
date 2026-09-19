SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpi4-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "61cb706fcc677f0f7c78ac9473a403ebfd546aafb1d5e39ed9dc21f6ff209473a802f200be7ab1fc1e05d9e4d86af117feb4feb77d83dcab242897bf13a1f6f5"

RPROVIDES:${PN} += "u-boot-rpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
