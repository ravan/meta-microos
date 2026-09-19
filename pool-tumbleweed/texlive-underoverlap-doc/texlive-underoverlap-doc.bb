SUMMARY = "Documentation for texlive-underoverlap"
DESCRIPTION = "This package includes the documentation for texlive-underoverlap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1_r1svn77682"

RPM_NAME = "texlive-underoverlap-doc-2026.226.0.0.0.1_r1svn77682-60.2.noarch.rpm"
RPM_HASH = "0bb0addefd3660633247a52ea33de3f3dbf27f602478e9c203443cbb7c2eeaf11d2e40e83d6aa811abc0caab2d9afb95306162093254b646d2603b666583739f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underoverlap-doc"

RDEPENDS:${PN} += ""

inherit rpm
