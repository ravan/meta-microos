SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "4562a9a4d3de89d7569dee65c1a4dcda0fdae0d273dff2043720474ecf64c53ad5e4e885263c4bddb7bf206e5bc05a82e69255dbf1737ad5c318cdecbc391f16"

RPROVIDES:${PN} += "u-boot-mvebuespressobin-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
