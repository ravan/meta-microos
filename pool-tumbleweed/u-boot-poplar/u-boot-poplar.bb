SUMMARY = "The U-Boot firmware for the poplar platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the poplar platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-poplar-2026.07-2.1.aarch64.rpm"
RPM_HASH = "88ee31856c74c8be21328165683483b985d7768e4812b37640f6f6e2bc0765136cdd5212c6e51a20c8f7a52a4358e012d5e060a2fc77bde029a5b46a9841250e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-poplar"

RDEPENDS:${PN} += ""

inherit rpm
