SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-qemu-arm64-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "08d43940064cc9667724bc5efd1f45f30ebf0c85e740a4388f1442e835035c4a6a4360a58de8b132e5072cfd9c104f1156047d72af75729e0413f8f59c4357e0"

RPROVIDES:${PN} += "u-boot-qemu-arm64-doc"

RDEPENDS:${PN} += ""

inherit rpm
