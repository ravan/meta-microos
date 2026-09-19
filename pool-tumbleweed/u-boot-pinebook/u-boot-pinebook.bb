SUMMARY = "The U-Boot firmware for the pinebook platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinebook-2026.07-2.1.aarch64.rpm"
RPM_HASH = "465e84fa33e55ea89e4645d1bdce97a50cdcc09c9cb2c0da6778581e9adcac0a15e9564f31f75cd17bca30c35a87b8e44311e9220745f99a543efaf4f11002be"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook"

RDEPENDS:${PN} += ""

inherit rpm
