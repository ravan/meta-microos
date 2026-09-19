SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-dragonboard820c-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "846188db71ea6f5f4fdea2bb6582bec952c5e6a441ee845cd60a789af6a0f8c3d5ccb8bf9faecdfdf031998e5877b5d48b26dc379679676474c968e547dddde9"

RPROVIDES:${PN} += "u-boot-dragonboard820c-doc"

RDEPENDS:${PN} += ""

inherit rpm
