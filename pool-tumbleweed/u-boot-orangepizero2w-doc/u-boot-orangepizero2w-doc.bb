SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepizero2w-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c654b711ec51671ea161419a0f913f71209670e8b52b52c52fa135fa6218a4420eaf6cb587b9292fc4520c2a30eef80750ea9a7a5d3e6eff1e5ee669732ce384"

RPROVIDES:${PN} += "u-boot-orangepizero2w-doc"

RDEPENDS:${PN} += ""

inherit rpm
