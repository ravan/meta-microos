SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rk3399-2.12.8-4.1.noarch.rpm"
RPM_HASH = "27037365e9d4776938fbacd30915ba9051df0338cdc2ccb0429665e77e0d54f0fe06a9fd7ef8bff86e7ec1f217523c7263f48ce79e5dd341809e4a72de03b5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
