SUMMARY = "Documentation for texlive-nicematrix"
DESCRIPTION = "This package includes the documentation for texlive-nicematrix"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.7svn78219"

RPM_NAME = "texlive-nicematrix-doc-2026.226.7.7svn78219-61.2.noarch.rpm"
RPM_HASH = "1d68e18d889879a327243e30220e7373f5fb9c9b482f1a37f61c2e5b978172eccbc78d124ee636f62c193672d05024eaafba08ca94b9b48c7d8125f07cdd1441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nicematrix-doc-fr \
texlive-nicematrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
