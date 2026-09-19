SUMMARY = "Documentation for texlive-pegmatch"
DESCRIPTION = "This package includes the documentation for texlive-pegmatch"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025bsvn76924"

RPM_NAME = "texlive-pegmatch-doc-2026.226.2025bsvn76924-58.2.noarch.rpm"
RPM_HASH = "54e7a7cfbbfb9992af16d6915aea1122a8f34f6735dfdc3f7100f27a127400453a9bc51c5e2b67297ee353c7c03eafb01203a1df8bd83d6aa4a12e56866e0e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pegmatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
