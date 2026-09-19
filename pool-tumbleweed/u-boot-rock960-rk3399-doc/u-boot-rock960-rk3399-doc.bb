SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock960-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "161d2f7d99ee307c50929cf24d391bf4abc1ae98902719e1ce6e8e4be36abf5de07a7d93aa17a79ffdfb49b327910aa707e1662b958ab0915abf07b7755c1c15"

RPROVIDES:${PN} += "u-boot-rock960-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
