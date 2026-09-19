SUMMARY = "Documentation for texlive-jyu-chem-thesis"
DESCRIPTION = "This package includes the documentation for texlive-jyu-chem-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77876"

RPM_NAME = "texlive-jyu-chem-thesis-doc-2026.226.1.0svn77876-63.2.noarch.rpm"
RPM_HASH = "44993ae25ff60811686a9a733d34a1eba393070d31739fca9a169ab0b8d326bf7896cbf5534c37508b02d53b63662a402b6b0cf99ff3dbdca12e8d552f247cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jyu-chem-thesis-doc-fi \
texlive-jyu-chem-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
