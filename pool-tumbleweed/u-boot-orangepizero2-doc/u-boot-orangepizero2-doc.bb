SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepizero2-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "8ecab64ee28a04f3c9eed48f9461c831075a2f5ed8a5778a9370207adb59c8a69d3f53db59a3272152bde1f2fcc3670f95732e3ffeeee75753a69fe0fc1099f6"

RPROVIDES:${PN} += "u-boot-orangepizero2-doc"

RDEPENDS:${PN} += ""

inherit rpm
