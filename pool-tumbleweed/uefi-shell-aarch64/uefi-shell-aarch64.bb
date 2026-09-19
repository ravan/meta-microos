SUMMARY = "UEFI Shell for AARCH64"
DESCRIPTION = "UEFI Shell for AARCH64"
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "uefi-shell-aarch64-202608-2.1.noarch.rpm"
RPM_HASH = "7197a51169e8fbcbaf623d337220887fd9d130e7c4d309cb4344c88b088430102d0a3670613f5c260f86fffabd6b1c38a40963cee0ade3b54511ad22a1e7383c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uefi-shell-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
