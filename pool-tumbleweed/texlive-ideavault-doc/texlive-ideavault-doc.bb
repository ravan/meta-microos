SUMMARY = "Documentation for texlive-ideavault"
DESCRIPTION = "This package includes the documentation for texlive-ideavault"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5svn74773"

RPM_NAME = "texlive-ideavault-doc-2026.226.1.0.5svn74773-60.2.noarch.rpm"
RPM_HASH = "a5b82df98423e0b73f1ac725160b53461107b851231f1d1beef6edf2b6a1876ffea7a927f8eb0ffcee6053986891e4ac2f0a8eb5e64655ae88d7698b577910aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ideavault-doc"

RDEPENDS:${PN} += ""

inherit rpm
