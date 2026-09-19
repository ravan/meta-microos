SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-poplar-2.12.8-4.1.noarch.rpm"
RPM_HASH = "3c2dee31e1b91c4589cfe5fe246c9cb0b598549e3786e97610f1a2a93c985a017a5b58a6ff14cdb03b6bfb633602bb296d6a948a45935a7d9ac206cebecf4b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar"

RDEPENDS:${PN} += ""

inherit rpm
