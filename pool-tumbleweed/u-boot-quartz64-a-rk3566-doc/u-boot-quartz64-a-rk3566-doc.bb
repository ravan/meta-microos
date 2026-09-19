SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-quartz64-a-rk3566-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "751d1f270107b367ff91f35b0dc73e2d1e3849c8a74a08ba6a65534735c9d0dbec2616dc532ea180b22ea90e0b99000fdb50edc74cd5efee9e316097cba488c7"

RPROVIDES:${PN} += "u-boot-quartz64-a-rk3566-doc"

RDEPENDS:${PN} += ""

inherit rpm
