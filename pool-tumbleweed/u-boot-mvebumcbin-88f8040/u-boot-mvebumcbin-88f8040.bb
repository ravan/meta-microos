SUMMARY = "The U-Boot firmware for the mvebumcbin-88f8040 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebumcbin-88f8040 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebumcbin-88f8040-2026.07-2.1.aarch64.rpm"
RPM_HASH = "e646ba8fdc35405a5aad0bfd67928eed672373b36b77d3dd5ce3eb801986cef864b210c99d77f4fc53441c336ffe0a712aa134d98d93e4c7aa88ae3a684768db"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebumcbin-88f8040"

RDEPENDS:${PN} += ""

inherit rpm
