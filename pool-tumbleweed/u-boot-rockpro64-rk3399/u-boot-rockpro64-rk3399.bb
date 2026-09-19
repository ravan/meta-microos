SUMMARY = "The U-Boot firmware for the rockpro64-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rockpro64-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rockpro64-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "2483968b6559b6f1e4753dc5460ab63544ec359970b97dd5fb00d64feb6e8e20b8f279c9ca76b946946c0968d6891e62133dab6232e1e3da475aef533cd098d7"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rockpro64-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
