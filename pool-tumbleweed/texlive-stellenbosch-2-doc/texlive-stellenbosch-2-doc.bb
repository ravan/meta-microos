SUMMARY = "Documentation for texlive-stellenbosch-2"
DESCRIPTION = "This package includes the documentation for texlive-stellenbosch-2"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn68183"

RPM_NAME = "texlive-stellenbosch-2-doc-2026.226.2.0svn68183-64.2.noarch.rpm"
RPM_HASH = "e55d252b08a74f89fdf170c554d96e666393c85c39eafe40ba1be5b002c4052725713c10326a3395f88b6a71bd908ba1fc79f28351f0fe9119130caaa033606b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stellenbosch-2-doc"

RDEPENDS:${PN} += ""

inherit rpm
