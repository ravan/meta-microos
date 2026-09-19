SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-2.12.8-4.1.aarch64.rpm"
RPM_HASH = "a8856320537543cc5e3d34c2388e0daa0b86edab8d3330d6826d931d0303357e640a0eb1274ec6345a30d590ee08dc62c986a99e63dbf1925530cdf23478e103"

RPROVIDES:${PN} += "arm-trusted-firmware"

RDEPENDS:${PN} += ""

inherit rpm
