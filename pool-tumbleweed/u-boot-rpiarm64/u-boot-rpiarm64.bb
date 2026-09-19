SUMMARY = "The U-Boot firmware for the rpiarm64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpiarm64 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpiarm64-2026.07-2.1.aarch64.rpm"
RPM_HASH = "b4dafc84201c3639a93b6733c97e4c2beb963a4962cc47e8cd9237ea97bd26e353e82069d7aaf3a46ba74a637b0cb3e3b75828e0c63807c7c9b67b434313b4bd"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3 \
u-boot-rpi4 \
u-boot-rpiarm64"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
