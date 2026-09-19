SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-qemu-2.12.8-4.1.noarch.rpm"
RPM_HASH = "1df05791863b58dda99bf1d5444676769b015812eba7af8f5b1149fa18e375656fe82cb729e1c5e12883f2311a9761aba510f8bed7a720ae3599357c2d5ab8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-qemu"

RDEPENDS:${PN} += ""

inherit rpm
