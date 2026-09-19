SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rpiarm64-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "424b6bef486b6e716f81cf465c19879ba09065826b0a50ff2b9246686802ea13bd584d2aa1edf0a783cffb5756abe5e26b2bb0d25e997a43a4c03602409eabb4"

RPROVIDES:${PN} += "u-boot-rpiarm64-doc"

RDEPENDS:${PN} += ""

inherit rpm
