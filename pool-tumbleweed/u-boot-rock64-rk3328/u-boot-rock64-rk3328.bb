SUMMARY = "The U-Boot firmware for the rock64-rk3328 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock64-rk3328 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock64-rk3328-2026.07-2.1.aarch64.rpm"
RPM_HASH = "f4eb56356d7de0fbffbcd9b28206246471a68ea08145b061928852c12bbeee8aff7cffa3eaef2fea2591270811d288fe7117e29c615c0ea488a61acf68abfb5c"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock64-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
