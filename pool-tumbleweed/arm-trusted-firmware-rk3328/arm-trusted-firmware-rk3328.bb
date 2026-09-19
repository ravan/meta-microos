SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rk3328-2.12.8-4.1.noarch.rpm"
RPM_HASH = "5aeb9636b73850177931fd640a7b3bf9b2771733cb96d34d4f22f050823f8f6eb5d848264cff5f406f05eb13bc779f50bcec43a5234a8c54294512b68889caf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
