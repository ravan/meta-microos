SUMMARY = "Documentation for texlive-multibibliography"
DESCRIPTION = "This package includes the documentation for texlive-multibibliography"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-multibibliography-doc-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "5927987a2e09ee5aaaac1039ff21fc45456758c43df25a74e9697794a6b77be57f638466052e19fcf21a72818e1fca22eff004a20fdf0232a12dc901d86ce696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
