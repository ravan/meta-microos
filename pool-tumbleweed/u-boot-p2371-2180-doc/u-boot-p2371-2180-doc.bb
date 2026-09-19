SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-p2371-2180-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "d61fb8f90ccffefdce2b27abe908f23afc378d807ed527f56a022048fd2d8184b844ce02e48431685e1ef13d58c18fcb2cf292049af6af8b0707b63f35260317"

RPROVIDES:${PN} += "u-boot-p2371-2180-doc"

RDEPENDS:${PN} += ""

inherit rpm
