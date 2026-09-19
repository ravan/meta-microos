SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-c2-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c20f35ff96b5be29ad0fa4056b2a82689eeda769ddd4a197cf0683e3603874cbf6ce40852853574d8c8f1c8dee5c12835f6c12fa0e5c6ce014c53ca6bc30a702"

RPROVIDES:${PN} += "u-boot-odroid-c2-doc"

RDEPENDS:${PN} += ""

inherit rpm
