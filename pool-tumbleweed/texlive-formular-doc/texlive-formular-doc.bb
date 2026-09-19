SUMMARY = "Documentation for texlive-formular"
DESCRIPTION = "This package includes the documentation for texlive-formular"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-formular-doc-2026.226.1.0asvn15878-60.2.noarch.rpm"
RPM_HASH = "29254550ae24c6f1397b9909803636e8d8167293ffa2284c6b434683e07e706e6f333c14d79a5b585bcfed97e8f5721356af19465c6e2db829bb4d24dccb81f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formular-doc"

RDEPENDS:${PN} += ""

inherit rpm
