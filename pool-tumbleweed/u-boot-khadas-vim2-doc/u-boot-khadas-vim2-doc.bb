SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-khadas-vim2-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "cf8d674b910b8e3c1c40215a8027dcbfff1fdf1deaee509f5716133972a05d666ade180701e9fe1582c852c10c83ae82190e555d77179343b81507a5f0f71e98"

RPROVIDES:${PN} += "u-boot-khadas-vim2-doc"

RDEPENDS:${PN} += ""

inherit rpm
