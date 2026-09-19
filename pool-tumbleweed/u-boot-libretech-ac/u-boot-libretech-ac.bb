SUMMARY = "The U-Boot firmware for the libretech-ac platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-ac platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-libretech-ac-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c0affed5bcb1b81dffe47e6fcda51bb9e41292f1b2f13bbfbbd480e583899ae76bf368424b83984dc85501b794365946153b95975afdc76f1dd84c534bad5b70"

RPROVIDES:${PN} += "u-boot-libretech-ac \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
