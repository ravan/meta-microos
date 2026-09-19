SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-fvp-2.12.8-4.1.noarch.rpm"
RPM_HASH = "aece5dae8a54ec046b842c53fc8756c399fe40912f8c4606a745d676b98b4234f9309905fde478a248b0f446e4cab62361022c8ee38418335b0bc5c353a8dfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-fvp"

RDEPENDS:${PN} += ""

inherit rpm
