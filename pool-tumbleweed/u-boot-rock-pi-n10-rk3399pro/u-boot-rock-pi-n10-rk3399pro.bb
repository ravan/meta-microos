SUMMARY = "The U-Boot firmware for the rock-pi-n10-rk3399pro platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-n10-rk3399pro platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-2026.07-2.1.aarch64.rpm"
RPM_HASH = "a87fd4efa3b2c178eccd4699fc557be06cae605dd5237e3cdb0738150e424bade81748fd215b73188fe9c3d3d83675bd9980b5befecb3b1f05c79df3b90ea3ce"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-n10-rk3399pro"

RDEPENDS:${PN} += ""

inherit rpm
