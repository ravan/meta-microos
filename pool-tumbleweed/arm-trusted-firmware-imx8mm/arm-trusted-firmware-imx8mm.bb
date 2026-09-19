SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-imx8mm-2.12.8-4.1.noarch.rpm"
RPM_HASH = "f0462e5abdf498587dbea90f90842faa18ff6fc65c28304224eeb3c15436e51f73081a226fdc1960fa011705f69b64ee3e54cd0c10640cfcf254d851dcbbe93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8mm"

RDEPENDS:${PN} += ""

inherit rpm
