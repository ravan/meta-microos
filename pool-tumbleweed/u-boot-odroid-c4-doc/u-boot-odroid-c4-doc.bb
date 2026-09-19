SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-c4-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "06b41372e0ceaf1f10e55f5e0a0ee80985cc8a8268ebe68e6b5d32062bc324d63b9c3a7162fcd54a184c8d2c04dc18aa918fe57cba6e08b1d5cb101229343c51"

RPROVIDES:${PN} += "u-boot-odroid-c4-doc"

RDEPENDS:${PN} += ""

inherit rpm
