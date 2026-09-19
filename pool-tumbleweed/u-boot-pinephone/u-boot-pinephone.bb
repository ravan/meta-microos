SUMMARY = "The U-Boot firmware for the pinephone platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinephone platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-pinephone-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c810b3b20d55cb94f4da243df19b9d5a0c84a4821535bcaefbee78610b3541df983b098533a92809801203f521c221f2f004eda7a0587f26d4383a1622bbc1ec"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinephone"

RDEPENDS:${PN} += ""

inherit rpm
