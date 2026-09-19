SUMMARY = "Documentation for texlive-impnattypo"
DESCRIPTION = "This package includes the documentation for texlive-impnattypo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn50227"

RPM_NAME = "texlive-impnattypo-doc-2026.226.1.5svn50227-60.2.noarch.rpm"
RPM_HASH = "3d8d8bc9714a73a7a425941859d690c7731de5c8f0dfeb18522b1c78fb28b6da38b12817ca1bfeb18e97b9e1ef077119f9fc4dc0178e4239ed163543157f5a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-impnattypo-doc-fr;en \
texlive-impnattypo-doc"

RDEPENDS:${PN} += ""

inherit rpm
