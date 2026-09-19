SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinebook-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "143e9260ee37309e848566b3f254c7efda3b7657ce02e9884079fd32a5a58dfe211307a72ad4657184678ab8e05c65fc15f45a3d84fb2c68595b3fe446971127"

RPROVIDES:${PN} += "u-boot-pinebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
