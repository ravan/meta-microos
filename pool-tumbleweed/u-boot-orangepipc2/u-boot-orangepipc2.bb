SUMMARY = "The U-Boot firmware for the orangepipc2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepipc2 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepipc2-2026.07-2.1.aarch64.rpm"
RPM_HASH = "22f2ae9ff6fdd1c0cff8e82b547bb6f13a768c61549491dd3204c398702a16c9483ec5fcb2b69bdfafdc5949e952224a20de67d20979ae902c70ad2f87892c58"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepipc2"

RDEPENDS:${PN} += ""

inherit rpm
