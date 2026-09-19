SUMMARY = "The U-Boot firmware for the bananapim64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the bananapim64 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-bananapim64-2026.07-2.1.aarch64.rpm"
RPM_HASH = "41b3be320ed5008efa4ad22abde81728b9909dbc4fa7ed079ad79ba09d08442fc7ae9364be24297dda300d618a5b4b606b622d56c81b44df56a74d057cfe2724"

RPROVIDES:${PN} += "u-boot-bananapim64 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
