SUMMARY = "The U-Boot firmware for the rock960-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock960-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-rock960-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "8a7cf1b960c30297b9e473fa40df484071af31b307679a53117333227e9d9c2d76af0adc907ec92b4f254e34bae771fab3193854c2094d0da6033211f1dfedeb"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock960-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
