SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebumcbin-88f8040-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "931e29d7e3ed68a79b4ab301e3c857fedcb247f88a72ac42125ac7d28b59c4f0ae2eb79e53b08a5385ed3a47a8fbc7d95b952fa272f8d4a86512f2dd4d839fdc"

RPROVIDES:${PN} += "u-boot-mvebumcbin-88f8040-doc"

RDEPENDS:${PN} += ""

inherit rpm
