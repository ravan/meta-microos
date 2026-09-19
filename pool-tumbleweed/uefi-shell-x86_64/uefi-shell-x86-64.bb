SUMMARY = "UEFI Shell for X86_64"
DESCRIPTION = "UEFI Shell for x86_64"
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "uefi-shell-x86_64-202608-2.1.noarch.rpm"
RPM_HASH = "aa1c424e64e081bc28b914f3c78f75c0234991dcfc14391251d6de17673f231c033b3458da8770c355e0f132fad81b6de7f30807e9039835a69fab2e3eba35fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uefi-shell-x86-64"

RDEPENDS:${PN} += ""

inherit rpm
