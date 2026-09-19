SUMMARY = "The U-Boot firmware for the mvebudb-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudb-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebudb-88f3720-2026.07-2.1.aarch64.rpm"
RPM_HASH = "d111da44603c3aac7d811c7caba44a3eb6613ee91150685ac90513716a4d6b4cccc3be5e41f6784ed15ca5f8e0a9975708147b29ff321f66dccc29e5bc1b69b1"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudb-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
