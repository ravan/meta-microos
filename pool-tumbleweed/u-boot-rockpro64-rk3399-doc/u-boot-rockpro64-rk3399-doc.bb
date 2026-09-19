SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rockpro64-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "2a28871abb69f947bf97e4b326591c625dcca4551786dbbad09ad536cf5c31ec3eadeed0e4064e398a4e5225614c56cc355cbcc833f351f01b6e5dbd5a9887c4"

RPROVIDES:${PN} += "u-boot-rockpro64-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
