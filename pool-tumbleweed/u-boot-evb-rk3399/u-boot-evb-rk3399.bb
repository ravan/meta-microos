SUMMARY = "The U-Boot firmware for the evb-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the evb-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-evb-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "5937fa84124dd5380123688d98d9c79c5afb7c7e1d993cb3b647780fd23a0b9248e9a7bfa6f90ce9c5e90822d1f4af5e17f9a87c240844b136ef6b1670684b73"

RPROVIDES:${PN} += "u-boot-evb-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
