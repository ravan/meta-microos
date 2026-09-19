SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopia64-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "1def0c785fd7b969f777aab980ca78c4047223dce149f7b063673d7cc368f9fdcd036704816c1ec37476af667606a337849253bf4a8f3aafbc3093286d4a424f"

RPROVIDES:${PN} += "u-boot-nanopia64-doc"

RDEPENDS:${PN} += ""

inherit rpm
