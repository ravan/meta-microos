SUMMARY = "Documentation for texlive-uplatex"
DESCRIPTION = "This package includes the documentation for texlive-uplatex"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-uplatex-doc-2026.226.svn77830-60.2.noarch.rpm"
RPM_HASH = "c8c20b713927887ba7ac31ff4cb6bd39ece20063ee0e49425b0e16f76cdb228f898ca3b0736fc8dc38b8afc41ac91dd93329a910fcf4523da74e91f58932a787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uplatex-doc-ja \
man-uplatex.1 \
texlive-uplatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
