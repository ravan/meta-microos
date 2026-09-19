SUMMARY = "Documentation for texlive-latexfileinfo-pkgs"
DESCRIPTION = "This package includes the documentation for texlive-latexfileinfo-pkgs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-doc-2026.226.0.0.22svn26760-61.2.noarch.rpm"
RPM_HASH = "e7974594c101ccbd485e0ae988db360c4ed098a7a99a5e6218da1005812ba0b25f0028c33d2e312bd2f27d9046711ac2797f1699117859940da4fbb787836359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs-doc"

RDEPENDS:${PN} += ""

inherit rpm
