SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebudb-88f3720-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "5c492c6b564761d307fd87270e3100f1bed0cbdac5394838a97b7cbf9ec7a10b17fe47d2f7d19a4d42149f254b7081c060c38356cd5485a1a6a2563ba4a17077"

RPROVIDES:${PN} += "u-boot-mvebudb-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
