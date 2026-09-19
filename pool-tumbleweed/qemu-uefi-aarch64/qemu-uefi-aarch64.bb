SUMMARY = "UEFI QEMU rom image (AArch64)"
DESCRIPTION = "This package contains the UEFI rom image (AArch64) for QEMU cortex-a57 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "qemu-uefi-aarch64-202608-2.1.noarch.rpm"
RPM_HASH = "4733aaa1750d9a06918b8677c2f072c475441732249cd9c21e9066b72dda055aaf6a01b27f89d55722aac99b5d9f0b75dca718ab775ca1e0c80a2ba947ddf6d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
