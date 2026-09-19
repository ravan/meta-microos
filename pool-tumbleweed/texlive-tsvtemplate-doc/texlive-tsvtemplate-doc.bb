SUMMARY = "Documentation for texlive-tsvtemplate"
DESCRIPTION = "This package includes the documentation for texlive-tsvtemplate"
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-doc-2026.226.2022_1.0svn65333-59.2.noarch.rpm"
RPM_HASH = "62c6e8df00a0e6732c0bcf4fce41578e271b1d21e1209e98fa47716da696f3c92b1ad140b355522db5e439b68266833f7cb360234a4dc80a836d99bcb35130db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tsvtemplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
