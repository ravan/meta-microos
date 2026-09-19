SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rpi3-2.12.8-4.1.noarch.rpm"
RPM_HASH = "b13eae082e31271159749605ab8e480478115ea5f03883bdd3b1fd542e4c1ddc994f57f2864caab58ffc227ba32bd211d3455e76b22b00810c7ea3816ef67e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rpi3"

RDEPENDS:${PN} += ""

inherit rpm
