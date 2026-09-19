SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-nanopc-t6-rk3588-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "b8071829373e132a06ef35e532655e435f18fb3d64e6fb8e3f216cee6a75c4e0f8b8c58f42e7e0ae5ec1b3a9e9473fe64a39a73e851d6dd1125ebf9d8a9e8b06"

RPROVIDES:${PN} += "u-boot-nanopc-t6-rk3588-doc"

RDEPENDS:${PN} += ""

inherit rpm
