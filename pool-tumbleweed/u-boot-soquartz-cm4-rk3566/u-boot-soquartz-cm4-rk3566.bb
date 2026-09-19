SUMMARY = "The U-Boot firmware for the soquartz-cm4-rk3566 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the soquartz-cm4-rk3566 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-soquartz-cm4-rk3566-2026.07-2.1.aarch64.rpm"
RPM_HASH = "b92dab9c8de5b5d992ce4557758db0152f83c4332bcd2cdcb534e42930dd7c06bdf236c52f1ba25d2a466327b16bc5ad2091dbb8c8e282a8044a8fdf56d553a7"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-soquartz-cm4-rk3566"

RDEPENDS:${PN} += ""

inherit rpm
