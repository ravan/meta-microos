SUMMARY = "The U-Boot firmware for the odroid-c4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c4 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-c4-2026.07-2.1.aarch64.rpm"
RPM_HASH = "79aa58500e24be6127716ac6270533561508eb5dff16ef5c40e8f044a145ae31d6a61ffcfc5aeb140375b5beaf5306ecbc830e81e0d4db30ad807cc1d3dd6af7"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c4"

RDEPENDS:${PN} += ""

inherit rpm
