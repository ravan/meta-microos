SUMMARY = "The U-Boot firmware for the odroid-c2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c2 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-odroid-c2-2026.07-2.1.aarch64.rpm"
RPM_HASH = "c28b22600ffcb8ab373f783fc34ed6ac1cf66fa841e4aea6f27967e54afac3cabb1b8662d981863a05728d0cf088876387a43bfcb21e3d5f252eec00bc5044c2"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c2"

RDEPENDS:${PN} += ""

inherit rpm
