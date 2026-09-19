SUMMARY = "UEFI Shell for RISCV64"
DESCRIPTION = "UEFI Shell for RISCV64"
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "uefi-shell-riscv64-202608-2.1.noarch.rpm"
RPM_HASH = "432b4b2e99ea0746bcbeb1edac2b79baa13cae77bd58a994c666e7fa4459db05bebf46975a5272298493a80c82e48ee3545c91e60805e3bac3eeb2829c88d2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uefi-shell-riscv64"

RDEPENDS:${PN} += ""

inherit rpm
