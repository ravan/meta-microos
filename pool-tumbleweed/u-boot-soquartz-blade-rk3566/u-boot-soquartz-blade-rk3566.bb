SUMMARY = "The U-Boot firmware for the soquartz-blade-rk3566 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the soquartz-blade-rk3566 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-soquartz-blade-rk3566-2026.07-2.1.aarch64.rpm"
RPM_HASH = "42fb79a1f6c75d79ca5aa1cf6a68a755bbdeb823d8a226ed7d52b1d2e13e8482069c95611000de2a7420586f5b8be01737ec2f5338021609ba6bfb9aee1ef2b6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-soquartz-blade-rk3566"

RDEPENDS:${PN} += ""

inherit rpm
