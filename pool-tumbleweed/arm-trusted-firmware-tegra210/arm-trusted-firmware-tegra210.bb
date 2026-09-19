SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-tegra210-2.12.8-4.1.noarch.rpm"
RPM_HASH = "377b29848596fdcb8e877546c00ba5056236ba67659741ce881a3ef5a581ef25c3242d413b0f83ea2e4b66b312c40ac7393a9bdb633808929737aa6eefde3fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-tegra210"

RDEPENDS:${PN} += ""

inherit rpm
