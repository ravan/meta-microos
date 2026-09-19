SUMMARY = "The U-Boot firmware for the geekbox platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the geekbox platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-geekbox-2026.07-2.1.aarch64.rpm"
RPM_HASH = "756e6df3c9c299489e5c4acf5f1e74d881eaa6fbc2c027945425e7cbb44f62b46894621e71e29f0fc1bf578e3dfe5aee7908aa2638078284205a587b596f0901"

RPROVIDES:${PN} += "u-boot-geekbox \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
