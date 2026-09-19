SUMMARY = "The U-Boot firmware for the quartz64-a-rk3566 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the quartz64-a-rk3566 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-quartz64-a-rk3566-2026.07-2.1.aarch64.rpm"
RPM_HASH = "9ad01d9b9cef4515cb68b5cd84b8dc857c3503caa4f328af649eaef0ca88dc3a2e422a24575676e3e194475b058dba9fe19d32749fe76a5138fa23ba55a77439"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-quartz64-a-rk3566"

RDEPENDS:${PN} += ""

inherit rpm
