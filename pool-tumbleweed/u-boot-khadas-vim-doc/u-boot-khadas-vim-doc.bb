SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-khadas-vim-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "4d5e98cf22a280487f4dba4fc971bd4139a3210ba547f027eb231f81ae62a41666b4eade99bd3c99a724e5100508e9afd63c034602fdf7decd6568386c626cea"

RPROVIDES:${PN} += "u-boot-khadas-vim-doc"

RDEPENDS:${PN} += ""

inherit rpm
