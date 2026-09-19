SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "fb37aafef9eb268480dcb93ad1ccc5c17eb0738164b3326dcc2e29bad4033d8d68dfb8500f0cf67b335d1de65bcc2c42d80ea8e1522ffa40e01cd9257b219ea2"

RPROVIDES:${PN} += "u-boot-nanopi-m4b-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
