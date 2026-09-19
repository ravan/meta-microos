SUMMARY = "The U-Boot firmware for the p2371-2180 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2371-2180 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-p2371-2180-2026.07-2.1.aarch64.rpm"
RPM_HASH = "ecf977ee88c43fd79184988cc3bbcc5d6297895eb033c67011ae76779da4df9d66a834a081196abe350fe76ff1aec624c930e7ee6487ba8fff75b12e679ba5b4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2371-2180"

RDEPENDS:${PN} += ""

inherit rpm
