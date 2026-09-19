SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-a80x0_mcbin-2.12.8-3.5.noarch.rpm"
RPM_HASH = "ffaf1173358dddcc0b8fb4803c31eea10e7661a181bec7f1957dca50f52958b181e042875c9da4172cf92ca9a7bd523d17c0311fcf058d892a42dc1df8bd8e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-a80x0-mcbin"

RDEPENDS:${PN} += ""

inherit rpm
