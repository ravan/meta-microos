SUMMARY = "The U-Boot firmware for the rock5b-rk3588 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock5b-rk3588 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock5b-rk3588-2026.07-2.1.aarch64.rpm"
RPM_HASH = "022930407ce66af2954b9e079774eef019ab724c87fd010fbf77e371ddf470f7caf03d0225537ba1e6d600fffb1ec6bc42a390b840ce3641ef0387d26de6b65e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock5b-rk3588"

RDEPENDS:${PN} += ""

inherit rpm
