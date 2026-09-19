SUMMARY = "Documentation for texlive-calculation"
DESCRIPTION = "This package includes the documentation for texlive-calculation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35973"

RPM_NAME = "texlive-calculation-doc-2026.226.1.0svn35973-59.2.noarch.rpm"
RPM_HASH = "e330777e608ed3d5d0e7dc829cd145193bcc22d62982801ffe3619dd950b6e45dea23d3d1486ac3063704c3d915dbf1ab4133deda90b8f38c735800684d76aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculation-doc"

RDEPENDS:${PN} += ""

inherit rpm
