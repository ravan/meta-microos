SUMMARY = "The U-Boot firmware for the hikey platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the hikey platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-hikey-2026.07-2.1.aarch64.rpm"
RPM_HASH = "f582c56a2e3bc92982ee2a5b0cb1e11ea39f2b7142c9e13c1e8d233d0b8ab816b65bde4de0269294b8a8275108626f5b468e1f5a9723c9d2c9ee51aa61edbc3e"

RPROVIDES:${PN} += "u-boot-hikey \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
