SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pineh64-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "ad530405f3f823035b4e6d2b242ba523b00723c5ddc4779a12d97032dfa48eb4a9c0faf9a962b4fb2e32183d9642a97c63e8c5632557be8cfe7292ae01e57748"

RPROVIDES:${PN} += "u-boot-pineh64-doc"

RDEPENDS:${PN} += ""

inherit rpm
