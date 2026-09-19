SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-sun50i_a64-2.12.8-4.1.noarch.rpm"
RPM_HASH = "847c5524bac63c3134d77ad550a6ba9b96fa19f0e433f027a848465826ab093bdb5bb6419c247186ae66f56c5e2a049c60574955f7df12d20f973bb10836fdc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i-a64"

RDEPENDS:${PN} += ""

inherit rpm
