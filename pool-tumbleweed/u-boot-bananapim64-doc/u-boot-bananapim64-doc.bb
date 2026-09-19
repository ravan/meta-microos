SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-bananapim64-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "654e47d564af2be6fd856143048d12b911f6593bcaba73025c38de81ebf829a11757d38134ca889580867029b7e94c7fe9d8aac66252d8591d8b0202bf2d21e9"

RPROVIDES:${PN} += "u-boot-bananapim64-doc"

RDEPENDS:${PN} += ""

inherit rpm
