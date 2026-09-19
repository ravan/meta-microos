SUMMARY = "Documentation for texlive-selinput"
DESCRIPTION = "This package includes the documentation for texlive-selinput"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-selinput-doc-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "6cb1a9d9cf463998fb56a1f2dea54b3d4bfb6afb5b681701b760ff91320ed5887a1a19d7315810c833d83c84a595668b2498150d4d6e93e66294527a1a1e90f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selinput-doc"

RDEPENDS:${PN} += ""

inherit rpm
