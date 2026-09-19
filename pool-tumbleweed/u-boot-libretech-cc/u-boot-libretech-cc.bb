SUMMARY = "The U-Boot firmware for the libretech-cc platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-cc platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-libretech-cc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "3566841e60818d9520a3526f643767e65957e3505501351407bb4a286a7f0fbb705ecdc426e066aa23b8ac081399ab5876c3211efe43e1344a08ec5df744641b"

RPROVIDES:${PN} += "u-boot-libretech-cc \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
