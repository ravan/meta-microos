SUMMARY = "Documentation for texlive-fixlatvian"
DESCRIPTION = "This package includes the documentation for texlive-fixlatvian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1asvn21631"

RPM_NAME = "texlive-fixlatvian-doc-2026.226.1asvn21631-59.2.noarch.rpm"
RPM_HASH = "4ede94bc5b2c0f38ff9098567c1ebaec94e7acb855e521ac64889f0793550de803546705c789846082f79c199e7650525f246106db51e87ac00e8142a7b6956f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixlatvian-doc-lv \
texlive-fixlatvian-doc"

RDEPENDS:${PN} += ""

inherit rpm
