SUMMARY = "Tools for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains: \
mkimage- a tool that creates kernel bootable images for U-Boot."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-tools-2026.07-2.1.aarch64.rpm"
RPM_HASH = "09f39738ccd85e66658db5d256bfa6d0e65a60da3748db120e04a558ba8e07da527f69e94ce4460d302e1276bd5f7d19ea0d0020fa3a8c4a1bedbf6a1c71bbb7"

RPROVIDES:${PN} += "u-boot-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
