SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rk3568-2.12.8-4.1.noarch.rpm"
RPM_HASH = "0e7829c789f177cb7b823f1c67d78e87f4298feda23db2b84cdf9fb31e3b2ed834f9ef1f2b03f845c2d91842b738564e6c3db2cb6580e387e03ab62bd270b154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3568"

RDEPENDS:${PN} += ""

inherit rpm
