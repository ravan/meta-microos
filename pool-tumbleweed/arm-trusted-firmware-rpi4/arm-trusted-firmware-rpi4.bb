SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rpi4-2.12.8-4.1.noarch.rpm"
RPM_HASH = "fc130e1012317a11dfd7c18e785359b1816a26090c0eca914772de7df7923e9497fb560352dd17478b8c88a033a9ade249b180551cac864b57cfe0c8ce5e35f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rpi4"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
