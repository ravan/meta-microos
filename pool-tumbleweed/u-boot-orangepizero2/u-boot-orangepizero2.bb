SUMMARY = "The U-Boot firmware for the orangepizero2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepizero2 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-orangepizero2-2026.07-2.1.aarch64.rpm"
RPM_HASH = "e06ebf144847de007f00750fd01e4a00db7f9afcaf96ce582939769e1996742332415d5b09503f63883b0ad401b67fad273e9b99020652e331cb1db57bf03459"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepizero2"

RDEPENDS:${PN} += ""

inherit rpm
