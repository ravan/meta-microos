SUMMARY = "Documentation for texlive-bidi-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-bidi-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-doc-2026.226.0.0.2svn62009-61.2.noarch.rpm"
RPM_HASH = "f17d2221c3b33d2ed236f4bcc756630f3f15d0b0629b21a52b6b60d4b72b6c09b2aa41fd189b7b78274a55e0dbfc202baee74b1d3f778878e2d2d78d88c8cd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-atbegshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
