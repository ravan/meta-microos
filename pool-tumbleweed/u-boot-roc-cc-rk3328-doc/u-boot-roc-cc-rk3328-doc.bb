SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-roc-cc-rk3328-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "49783e51b36d66d4b94b00139b3bcc802f53ac98f53cde83aea7cfc223ef9f43b88acbd667fe6d670313cc8482c023789db463b798c40dfa352f2ab479d9c7a2"

RPROVIDES:${PN} += "u-boot-roc-cc-rk3328-doc"

RDEPENDS:${PN} += ""

inherit rpm
