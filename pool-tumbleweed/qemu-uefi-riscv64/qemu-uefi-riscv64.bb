SUMMARY = "UEFI QEMU rom image (RISC-V 64)"
DESCRIPTION = "This package contains the UEFI rom image (RISC-V 64) for QEMU \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "qemu-uefi-riscv64-202608-2.1.noarch.rpm"
RPM_HASH = "6cffd637e7519b928e66150f8fdb1cbd854ca9422c43af4b03615171baf8b3d5d46464f54919eea6fc6b54a9a8f9f8703d151031a5470a2e2542c85ea240661f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-riscv64"

RDEPENDS:${PN} += ""

inherit rpm
