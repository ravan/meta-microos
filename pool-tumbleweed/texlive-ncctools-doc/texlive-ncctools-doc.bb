SUMMARY = "Documentation for texlive-ncctools"
DESCRIPTION = "This package includes the documentation for texlive-ncctools"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-doc-2026.226.3.5.3svn51810-61.2.noarch.rpm"
RPM_HASH = "1ce8bb9ccbe42396595586c7326d20adf9012b52df86afb5e97e013627f083ccd0166b20a01bfc8a69211bd29817d98149644cbad7edb1654b0192b851160a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ncctools-doc"

RDEPENDS:${PN} += ""

inherit rpm
