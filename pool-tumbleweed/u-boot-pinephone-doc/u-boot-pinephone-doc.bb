SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinephone-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "41055aeb2eaeb1488bda1bfd179fc23930426971e93f40c2a289054d001bfd71c2a3df1fc5b3c13363722cbcc85d92e7b67ec6eb0f0786fd9b00701184b4389d"

RPROVIDES:${PN} += "u-boot-pinephone-doc"

RDEPENDS:${PN} += ""

inherit rpm
