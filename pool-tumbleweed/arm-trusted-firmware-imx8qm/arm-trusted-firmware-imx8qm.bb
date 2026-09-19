SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-imx8qm-2.12.8-4.1.noarch.rpm"
RPM_HASH = "fdbeef25890c6f6e0c962d64b2b34d41fd62e5539dba28aa8498332ff1b99aebed896dc62141eae863fa61afd392a2025b6959d2b05e53a12ed2dcae6423dbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8qm"

RDEPENDS:${PN} += ""

inherit rpm
