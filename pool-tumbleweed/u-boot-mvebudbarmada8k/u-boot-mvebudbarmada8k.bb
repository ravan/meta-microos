SUMMARY = "The U-Boot firmware for the mvebudbarmada8k platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudbarmada8k platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebudbarmada8k-2026.07-2.1.aarch64.rpm"
RPM_HASH = "616da041a42583e67f54635201144497a9034bb89b8b3a9ce7cacd296880f683922e866b283fbbd4330b3a839edf8aaf1285a81c68ff3258a4f180fa38ba3e9a"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudbarmada8k"

RDEPENDS:${PN} += ""

inherit rpm
