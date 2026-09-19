SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-imx8qx-2.12.8-4.1.noarch.rpm"
RPM_HASH = "e44190e1fa3cd09261dd0c3011cf64d67c4e1e9f7ba8a27e0cf18b5a696aa93a75d70ffc4a824191cc3256fb6753b8f56d613f38256b83b5700dbce53c9715b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8qx"

RDEPENDS:${PN} += ""

inherit rpm
