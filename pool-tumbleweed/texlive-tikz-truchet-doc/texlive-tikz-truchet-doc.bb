SUMMARY = "Documentation for texlive-tikz-truchet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-truchet"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn50020"

RPM_NAME = "texlive-tikz-truchet-doc-2026.226.svn50020-59.2.noarch.rpm"
RPM_HASH = "71e55079ddba0ec56635d09496a883235c13828c6c44398a20b7c95f1f2e6ccaa600bdc0bdaa667fb6a43db1c6e3ea824106ca671ae6de1c651f89c022c3c785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-truchet-doc"

RDEPENDS:${PN} += ""

inherit rpm
