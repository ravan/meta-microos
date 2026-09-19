SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-firefly-rk3399-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "1c7c18e0ffcc29b166ccffbc37ce32cbc6a8c9b3bbf8f4c702dcd3ac33ebc0c1d1342e1a159a7835287bfb38c7a2a6a39f3602d19d74727f985dac8737bb1be2"

RPROVIDES:${PN} += "u-boot-firefly-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
