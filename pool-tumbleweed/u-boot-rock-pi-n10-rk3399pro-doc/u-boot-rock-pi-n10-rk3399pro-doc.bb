SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "53f9a74fe194f1a45b32a0ea23d073f3b5160ab8a8bcc22236e351e5cfb2f4af70b83da0586f083965003e0cfd116c977c50eec9e1713cac04573c46071b88eb"

RPROVIDES:${PN} += "u-boot-rock-pi-n10-rk3399pro-doc"

RDEPENDS:${PN} += ""

inherit rpm
