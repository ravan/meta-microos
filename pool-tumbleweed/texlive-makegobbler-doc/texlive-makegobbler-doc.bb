SUMMARY = "Documentation for texlive-makegobbler"
DESCRIPTION = "This package includes the documentation for texlive-makegobbler"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.2svn78189"

RPM_NAME = "texlive-makegobbler-doc-2026.226.0.0.3.2svn78189-59.2.noarch.rpm"
RPM_HASH = "6af2426d3a75f96e439319dbde5b093fef47e6ac91ae783e3b507a4729a686b9674b7b718398a6f5a10fcb5e451c70086a647846231681e0358877b9ae763ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makegobbler-doc-fr \
texlive-makegobbler-doc"

RDEPENDS:${PN} += ""

inherit rpm
