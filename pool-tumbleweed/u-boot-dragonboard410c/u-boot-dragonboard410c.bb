SUMMARY = "The U-Boot firmware for the dragonboard410c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard410c platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-dragonboard410c-2026.07-2.1.aarch64.rpm"
RPM_HASH = "76a7503b1a422db2e6ec9b9cdd1fdcac470e956c5ba36f3d5b4f4ec2a3ca31ee307e21d8a06b9c384581ae5e189f6e4d972ec8fdb86fd287f28d381c2f733668"

RPROVIDES:${PN} += "u-boot-dragonboard410c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
