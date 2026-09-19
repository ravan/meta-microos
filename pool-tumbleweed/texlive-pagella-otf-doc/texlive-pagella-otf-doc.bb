SUMMARY = "Documentation for texlive-pagella-otf"
DESCRIPTION = "This package includes the documentation for texlive-pagella-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-pagella-otf-doc-2026.226.0.0.02svn77682-58.2.noarch.rpm"
RPM_HASH = "ac00106855b228c0e9ff9922ca6e6528b857cdb5e98c1e0594f64af5c66e95b4bf74a7e8b2baad964a3a6ea5d790ac148e95edff4a2600c3b6028723ed5f7f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagella-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
