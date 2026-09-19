SUMMARY = "Documentation for texlive-rerunfilecheck"
DESCRIPTION = "This package includes the documentation for texlive-rerunfilecheck"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn77682"

RPM_NAME = "texlive-rerunfilecheck-doc-2026.226.1.11svn77682-60.4.noarch.rpm"
RPM_HASH = "47d8ba320d387b13868944f59b416503440815813ab00354a569c6dc97bee90f4702d0c12e8cc96341891197602795075fec6dcc4b977ed6564c1c9e5ca240d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rerunfilecheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
