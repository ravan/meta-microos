SUMMARY = "Documentation for texlive-unizgklasa"
DESCRIPTION = "This package includes the documentation for texlive-unizgklasa"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-doc-2026.226.1.0svn51647-60.2.noarch.rpm"
RPM_HASH = "b999e51b56cd4baf00cf6d9d00c245bed9fbd75f0c0e746af2f5f10b04886ae88b87abce072b0f5fd42292a2888810ebd4123ea3807af06699475fc9e2134db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-unizgklasa-doc-hr \
texlive-unizgklasa-doc"

RDEPENDS:${PN} += ""

inherit rpm
