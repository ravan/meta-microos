SUMMARY = "The U-Boot firmware for the roc-cc-rk3328 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the roc-cc-rk3328 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-roc-cc-rk3328-2026.07-2.1.aarch64.rpm"
RPM_HASH = "a2b6eb20c1edff157c9a2f146b0a29d7853150774641fdf1aa8adff4b38b9b01ff86585f33575bd6339792b3265cf8dbb86958280f282a1461a3fb31094433d6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-roc-cc-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
