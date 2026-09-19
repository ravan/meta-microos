SUMMARY = "The U-Boot firmware for the quartz64-b-rk3566 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the quartz64-b-rk3566 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-quartz64-b-rk3566-2026.07-2.1.aarch64.rpm"
RPM_HASH = "3939daf059afdb060f62d78a2fc157fd0865a025f39ec2cbd661b27714020a0ef5bd9e37bc05efdda4f5dab6dfe43ea1f52afc460aef9df3a3e629528fc50637"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-quartz64-b-rk3566"

RDEPENDS:${PN} += ""

inherit rpm
