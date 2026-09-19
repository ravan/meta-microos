SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopc-t4-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "ae201e88cc671bd283b66f91c6d5adba9f045f4c440f4ecea2d92cf687fe84ca8e222335d55d29a7d60b14dcca360e31c00be23682e8b60934596ef8348ae826"

RPROVIDES:${PN} += "u-boot-nanopc-t4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
