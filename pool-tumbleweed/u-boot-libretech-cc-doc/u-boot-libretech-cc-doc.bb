SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-libretech-cc-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "30bc4653f8dae47d5466128e6aa0202e4f2f4f4a465d7dac72b768b2078ab2e9a7c215495a247a9995eb35be137770e282df8aa65124d06feff03afbea02312a"

RPROVIDES:${PN} += "u-boot-libretech-cc-doc"

RDEPENDS:${PN} += ""

inherit rpm
