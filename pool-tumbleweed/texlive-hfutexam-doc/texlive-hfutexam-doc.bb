SUMMARY = "Documentation for texlive-hfutexam"
DESCRIPTION = "This package includes the documentation for texlive-hfutexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn75068"

RPM_NAME = "texlive-hfutexam-doc-2026.226.1.10svn75068-60.4.noarch.rpm"
RPM_HASH = "bf63711bef3332ecc481a5c0baa2d2ec67ba01c8d5d979753b8c0572dc3c90eff69580163b79aa9bb912707927ea7adbdf2a00905996df3758aa4d9286d248e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfutexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
