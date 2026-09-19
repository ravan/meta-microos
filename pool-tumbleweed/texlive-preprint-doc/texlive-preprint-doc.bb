SUMMARY = "Documentation for texlive-preprint"
DESCRIPTION = "This package includes the documentation for texlive-preprint"
LICENSE = "LPPL-1.0"

PV = "2026.226.2011svn30447"

RPM_NAME = "texlive-preprint-doc-2026.226.2011svn30447-59.2.noarch.rpm"
RPM_HASH = "c22a259042c9523c7a7ef59bc822778d0f43597aa6c1ee275602afa0db59e62b498f29212438ca24ccd2e64ae19b42a7002b5c908af0872d755d5eb159b2cd4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
