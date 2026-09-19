SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock64-rk3328-doc-2026.07-2.1.aarch64.rpm"
RPM_HASH = "bc13ad9187336290ae74134d92e38baf867a09e075275619a4247fd3749aad54f1c48af4250389cd476681427079408b15dd3c92cbf6785e8955801a6b72f933"

RPROVIDES:${PN} += "u-boot-rock64-rk3328-doc"

RDEPENDS:${PN} += ""

inherit rpm
