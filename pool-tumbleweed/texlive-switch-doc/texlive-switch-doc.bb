SUMMARY = "Documentation for texlive-switch"
DESCRIPTION = "This package includes the documentation for texlive-switch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn77050"

RPM_NAME = "texlive-switch-doc-2026.226.1.1bsvn77050-64.2.noarch.rpm"
RPM_HASH = "dd2ec131c7d4481faa2f7fc6a6d17131a594d96a2e9505de6608904a845897944587e003c6baac0d0eb05514669bdbfb9d55817339380b9d851164e6f98e34e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-switch-doc"

RDEPENDS:${PN} += ""

inherit rpm
