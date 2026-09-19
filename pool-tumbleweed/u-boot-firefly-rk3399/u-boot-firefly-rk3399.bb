SUMMARY = "The U-Boot firmware for the firefly-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the firefly-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2026.07"

RPM_NAME = "u-boot-firefly-rk3399-2026.07-2.1.aarch64.rpm"
RPM_HASH = "fb6110cdf64b5b5ca5914453ce167e3b93b13b6cf5a2e3d047ce4841c11783cec2b53f9eb319973ff73fb082ad947f92da7ba966910ceb2dff80bc7c4c2cb2a0"

RPROVIDES:${PN} += "u-boot-firefly-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
