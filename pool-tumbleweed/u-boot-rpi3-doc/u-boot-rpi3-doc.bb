SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpi3-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "53b2435d67204de7161637b41f5f1d33a6d780a518eb9ae5cf6e8d1d2d59cd72a04524a3de853f4eb3a24dec46b12596adb42b9634c9811a4c73e1cc53f1c709"

RPROVIDES:${PN} += "u-boot-rpi3-doc"

RDEPENDS:${PN} += ""

inherit rpm
