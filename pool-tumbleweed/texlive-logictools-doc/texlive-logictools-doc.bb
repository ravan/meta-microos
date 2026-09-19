SUMMARY = "Documentation for texlive-logictools"
DESCRIPTION = "This package includes the documentation for texlive-logictools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-logictools-doc-2026.226.0.0.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "fdbe00e8b5f0a7ccbf08d02309fc03f2e08bcd6a45bef176cfd432423a97bcdef1aceed757b5741cdf805f49566ed9fe469351f2733d78bfa6d70b3795ba9bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logictools-doc"

RDEPENDS:${PN} += ""

inherit rpm
