SUMMARY = "The U-Boot firmware for the dragonboard820c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard820c platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-dragonboard820c-2026.07-2.1.aarch64.rpm"
RPM_HASH = "f524f9932cafe80111714f69dee440d946001169020fd73c4fb172af6255f331a414a3980d25052910071ae95bd81a1e1ed3dce3f750798c1b14ad27da7c56d6"

RPROVIDES:${PN} += "u-boot-dragonboard820c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
