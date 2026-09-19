SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinebook-pro-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "758ea028fb3f8b3c726714c3869ede1d8742d976de947f5f9ba4024eb84d715c2e0a408aebb9cc7d14ed808a58a3c5167f89d5f204da2a80462cc80b0e7ea8aa"

RPROVIDES:${PN} += "u-boot-pinebook-pro-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
