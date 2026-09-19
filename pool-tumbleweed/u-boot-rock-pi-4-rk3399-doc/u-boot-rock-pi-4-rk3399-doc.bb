SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock-pi-4-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "d29da7894145bf0cbd4d9061a1a036d35659182e45289a71d06564b2840c0b02ac9114e900745e366a81ff34316a13bfc050e7bedc8acf3fdddc3fff2c706389"

RPROVIDES:${PN} += "u-boot-rock-pi-4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
