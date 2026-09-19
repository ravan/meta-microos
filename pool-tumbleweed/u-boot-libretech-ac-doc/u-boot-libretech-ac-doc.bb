SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-libretech-ac-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "30902cc80350db14df1dfeaddf79394ef381de4e8e0c819487740d68a5a8cb991fd914a5990afb42e9942cb8708bcc33099dec692d4071f6b0fd46360b98c32d"

RPROVIDES:${PN} += "u-boot-libretech-ac-doc"

RDEPENDS:${PN} += ""

inherit rpm
