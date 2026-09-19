SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-qemu_sbsa-2.12.8-4.1.noarch.rpm"
RPM_HASH = "10317cbc28d51808f57e632b43480695a2988452602c5654879144f97198931705e1ed1e684eaae46ff5bf9d045a1795e546da6e69216965180df7ca26bd8cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-qemu-sbsa"

RDEPENDS:${PN} += ""

inherit rpm
