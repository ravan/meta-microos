SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-geekbox-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "6744226bf925326a7c1ee37b15de7596dd82939cb585c0b9cf51d75d4bb8ce5fa576328cb3e4242530e4d6956d6a203e7147021b3d395a510c54c55ee4bf6205"

RPROVIDES:${PN} += "u-boot-geekbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
