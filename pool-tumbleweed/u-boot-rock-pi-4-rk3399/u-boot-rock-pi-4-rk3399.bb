SUMMARY = "The U-Boot firmware for the rock-pi-4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock-pi-4-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "333155a4a6ab7b6546b0ec06ca6111b4169ea48766e20461d6de3070a6fac09c3defe9706414499d2f815b94ca670a22e40605106653a69796935cb14819c7e8"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
