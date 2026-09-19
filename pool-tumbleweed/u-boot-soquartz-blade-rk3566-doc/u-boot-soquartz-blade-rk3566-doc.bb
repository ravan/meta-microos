SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-soquartz-blade-rk3566-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "8a96af80653caf2b35d3aacf1437afe21bc29e7b5c28a91a8bc4c9877c93e3d418f27a7026b2cc9a08ab53ff8cd7371901df4aff4b65398831078984f37732aa"

RPROVIDES:${PN} += "u-boot-soquartz-blade-rk3566-doc"

RDEPENDS:${PN} += ""

inherit rpm
