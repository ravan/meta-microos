SUMMARY = "Documentation for texlive-xcntperchap"
DESCRIPTION = "This package includes the documentation for texlive-xcntperchap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-doc-2026.226.0.0.5svn54080-59.4.noarch.rpm"
RPM_HASH = "7e8f1909a6d9580c6d3886bce458360b8f0b7063c3e7bf0851689ffd44cb1f7f88848d3ada65da71788170c52c94a12d276bb8b5e74b2a451f394d2d27769e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
