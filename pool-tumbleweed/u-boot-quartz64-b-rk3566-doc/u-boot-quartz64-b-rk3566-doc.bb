SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-quartz64-b-rk3566-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "b89be3f8245890c4c8d7a6712451e5e14def5ba74d75046709300edf98325291b361ebfa1dd20f0a6cc8411fcc17e53ade41718f4fbf066ff7ab058030d1f5ae"

RPROVIDES:${PN} += "u-boot-quartz64-b-rk3566-doc"

RDEPENDS:${PN} += ""

inherit rpm
