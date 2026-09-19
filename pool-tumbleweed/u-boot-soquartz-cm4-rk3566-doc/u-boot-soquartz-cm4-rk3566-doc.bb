SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-soquartz-cm4-rk3566-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "94e14c8ee750962b75bc0d3350f699a266796627b2d7eb5c58c0c2cafd24698a99ff6c1e45e0ed7e80264059f9da618b8168666e9ebde72eccd6f1e7803ae851"

RPROVIDES:${PN} += "u-boot-soquartz-cm4-rk3566-doc"

RDEPENDS:${PN} += ""

inherit rpm
