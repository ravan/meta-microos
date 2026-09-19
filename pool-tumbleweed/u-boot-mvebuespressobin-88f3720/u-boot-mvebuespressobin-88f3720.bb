SUMMARY = "The U-Boot firmware for the mvebuespressobin-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebuespressobin-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-2026.07-2.1.aarch64.rpm"
RPM_HASH = "d7cd9ce806ccf753af03835d74dfd6309c84da8fca7259b23c45a66b5a8843b5c2f745b60f3fbfd7dcafc107e1d79090914eb2a1b789d0552d50a036c615360c"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebuespressobin-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
