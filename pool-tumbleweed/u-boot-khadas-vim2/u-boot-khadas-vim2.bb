SUMMARY = "The U-Boot firmware for the khadas-vim2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim2 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-khadas-vim2-2026.07-2.1.aarch64.rpm"
RPM_HASH = "b22a89b075f2153b0f4c3e574aacffe3c2bf8fb8b246c875772e82c82aeecfb42b50c570098d4bf1fd2c40ecd7048e59bc41decfeca9055a80fe36eb778cef56"

RPROVIDES:${PN} += "u-boot-khadas-vim2 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
