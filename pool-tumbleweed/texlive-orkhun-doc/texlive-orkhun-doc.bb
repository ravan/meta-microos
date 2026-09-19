SUMMARY = "Documentation for texlive-orkhun"
DESCRIPTION = "This package includes the documentation for texlive-orkhun"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-orkhun-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "5a7103b80860cce16a0f15e5a00e051224f4f2521c15435e27fd941d4c09991531be3eaf0f3df062047b7cde0486f23028a5920f4ae83fe15e109f5d2367ccd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orkhun-doc"

RDEPENDS:${PN} += ""

inherit rpm
