SUMMARY = "Documentation for texlive-fix2col"
DESCRIPTION = "This package includes the documentation for texlive-fix2col"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-doc-2026.226.0.0.04svn38770-59.2.noarch.rpm"
RPM_HASH = "1c04cf0d2264bbbdc03d21c9ca8ec7b449972a0208c98bf5fbb439b5402e9c902058f89bfba1c6f113440ae0291ca04c6bc6384c1e9069cf5fe01e98b3605504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fix2col-doc"

RDEPENDS:${PN} += ""

inherit rpm
