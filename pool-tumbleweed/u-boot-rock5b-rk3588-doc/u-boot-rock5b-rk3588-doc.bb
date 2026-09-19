SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock5b-rk3588-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "21b40e257efd4c078a0f98b5f145d055a90033cf3c6bb68985ba565b977e79e833f0caa9eecab435094299e7631e7b0fcd1e68cbe30ca0daf88872861cab0969"

RPROVIDES:${PN} += "u-boot-rock5b-rk3588-doc"

RDEPENDS:${PN} += ""

inherit rpm
