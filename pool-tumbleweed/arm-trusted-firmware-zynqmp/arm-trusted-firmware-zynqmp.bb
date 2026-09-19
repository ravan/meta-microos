SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-zynqmp-2.12.8-4.1.noarch.rpm"
RPM_HASH = "2924db4fb7090ea6cccc1c67c135bc873b9c75a88ee281410cbd3dd314454e489a15a510793fe441d9c6f753a9ea4538344272cf97b0a273d88ffe963a4a25ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-zynqmp"

RDEPENDS:${PN} += ""

inherit rpm
