SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-rk3368-2.12.8-4.1.noarch.rpm"
RPM_HASH = "50ec548a9d54cbab8f3d9aef1ce1c4be06578a1450298c7a75f2c6c3aee3c184e4181589defcfafc2cb427178f15b55e21a8e5ff69e1d4a2f62b60ab66366f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3368"

RDEPENDS:${PN} += ""

inherit rpm
