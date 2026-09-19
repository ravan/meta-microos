SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-sun50i_h616-2.12.8-4.1.noarch.rpm"
RPM_HASH = "5f4a58fb48a2a0330b2b2be634f4b6af7fa65c3632f97fc849718fc908ff3afa90e87d7b772d2121c1c4625a524123815942514c0c0653687e16d67832dc0d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i-h616"

RDEPENDS:${PN} += ""

inherit rpm
