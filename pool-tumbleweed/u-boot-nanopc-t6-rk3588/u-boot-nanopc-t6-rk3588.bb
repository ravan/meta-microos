SUMMARY = "The U-Boot firmware for the nanopc-t6-rk3588 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopc-t6-rk3588 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopc-t6-rk3588-2026.07-2.1.aarch64.rpm"
RPM_HASH = "136db19fc6f95ccd9a73fc0a4d5b6ccf0d900f13aa4018a1a17a3af6fd786ec8815c092ae9120dcc5f5821b7caadbc65db668af0fb4abb9b656f158d7e3346cc"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopc-t6-rk3588"

RDEPENDS:${PN} += ""

inherit rpm
