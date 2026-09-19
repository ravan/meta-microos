SUMMARY = "Documentation for texlive-lm"
DESCRIPTION = "This package includes the documentation for texlive-lm"
LICENSE = "LPPL-1.3c"

PV = "2026.226.2.005svn77682"

RPM_NAME = "texlive-lm-doc-2026.226.2.005svn77682-61.2.noarch.rpm"
RPM_HASH = "018e653c081072792d5be25c935f744d48e27c786b9ef476261d8c60109eef68b5e4ab74b7c43b50a07d4c951c8c5d79a42bc9afd75c8c08615f313440c10271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-doc"

RDEPENDS:${PN} += ""

inherit rpm
