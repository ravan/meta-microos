SUMMARY = "Documentation for texlive-fetamont"
DESCRIPTION = "This package includes the documentation for texlive-fetamont"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fetamont-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "9202f254a81d4f83990a1b2482b070a8f80cf3a04da16c87d1a1411f493f79d97abc6bafb292be8b98c926b6022892da1b9fc894b05dbd6f5a245f1d3285d7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetamont-doc"

RDEPENDS:${PN} += ""

inherit rpm
