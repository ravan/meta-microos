SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-n2-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "7f68f8354bfa0e8351c2dc7e6025aeacd50ab03a75d343d58f10eae5bfdb07ead340ad1d6a48629a6f9d26447e3b984680bf2784461126f853e395bb9c7181e9"

RPROVIDES:${PN} += "u-boot-odroid-n2-doc"

RDEPENDS:${PN} += ""

inherit rpm
