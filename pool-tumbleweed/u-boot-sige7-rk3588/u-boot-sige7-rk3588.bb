SUMMARY = "The U-Boot firmware for the sige7-rk3588 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the sige7-rk3588 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-sige7-rk3588-2026.07-2.1.aarch64.rpm"
RPM_HASH = "194c11ef9fa2d6e434fd8f22a47831443a029aac81441821a0695d8787680184b7c550d142bf505f2153cc8f9cc60873b460d336163e72a5f4bd222f334087ba"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-sige7-rk3588"

RDEPENDS:${PN} += ""

inherit rpm
