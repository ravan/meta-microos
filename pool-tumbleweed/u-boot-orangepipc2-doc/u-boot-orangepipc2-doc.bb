SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepipc2-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "94db8a8412e40dc40852cfba2951a3f0d3b22aa061fdf378de17eee9656c3ff11d5122f2f54cf931cf17e635eefbc9b09c477a41c22fcf50badabc5b29417754"

RPROVIDES:${PN} += "u-boot-orangepipc2-doc"

RDEPENDS:${PN} += ""

inherit rpm
