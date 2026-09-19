SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-dragonboard410c-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "5e53cd83992538cc1130e5806e246b9506fc490c86eac54e165b512ab08897fd82255e4798285ee037ef373ad01b6a3772e677a15fe75fd01479685d663d3111"

RPROVIDES:${PN} += "u-boot-dragonboard410c-doc"

RDEPENDS:${PN} += ""

inherit rpm
