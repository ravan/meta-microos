SUMMARY = "Documentation for texlive-bibcop"
DESCRIPTION = "This package includes the documentation for texlive-bibcop"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.32svn75042"

RPM_NAME = "texlive-bibcop-doc-2026.226.0.0.0.32svn75042-61.2.noarch.rpm"
RPM_HASH = "c402684599cec153c3eb768a435865c9f7f24bf2e60775785633f4d0ceb59e4a320ff5091dcd756a9b1cd2098924d1476d38e8ecedb92e897b77714cb435557e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibcop.1 \
texlive-bibcop-doc"

RDEPENDS:${PN} += ""

inherit rpm
