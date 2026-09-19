SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pine64plus-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "11667c746578762fca85313f47f7a1e43b27f0b91fcdf93862f4743fdddc1b4653696aef00fe2dd5a69afea713b405a4b0c6e944f92c95396623f054e53c4b58"

RPROVIDES:${PN} += "u-boot-pine64plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
