SUMMARY = "Documentation for texlive-xfor"
DESCRIPTION = "This package includes the documentation for texlive-xfor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-xfor-doc-2026.226.1.05svn77682-59.4.noarch.rpm"
RPM_HASH = "29af7d312aaeb7a54bd79d37529d3418cfba6897e753d6a93e473a11ef306989431f4f50df23b18ea8984363e3b8ab3498019e423683a5a5f0971e9e04a0ece9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfor-doc"

RDEPENDS:${PN} += ""

inherit rpm
