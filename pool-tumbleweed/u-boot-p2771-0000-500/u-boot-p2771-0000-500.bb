SUMMARY = "The U-Boot firmware for the p2771-0000-500 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2771-0000-500 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-p2771-0000-500-2026.07-2.1.aarch64.rpm"
RPM_HASH = "4261bf0253940efd4e00bb6597d27a2f7edefb69969099c7ae75f4f5bad822f0f4d319756a4269ecd3d3fde579b2d452b2710f9804fcd80b2f593769f582a806"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2771-0000-500"

RDEPENDS:${PN} += ""

inherit rpm
