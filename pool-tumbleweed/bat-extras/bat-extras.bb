SUMMARY = "Extra scripts for bat"
DESCRIPTION = "Bash scripts that integrate bat with various command line tools."
LICENSE = "MIT"

PV = "2024.08.24"

RPM_NAME = "bat-extras-2024.08.24-3.3.noarch.rpm"
RPM_HASH = "b0a39b67bb847b0ab5d92fe39f3c1773c1b509e3dafe1e70a233e14aa06ba5d501ed90d0de1afe35fd693e5381ff6e6fdafaf377571cada35f58261b54fbf325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-extras"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
bat"

inherit rpm
