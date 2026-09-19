SUMMARY = "Documentation for texlive-robustcommand"
DESCRIPTION = "This package includes the documentation for texlive-robustcommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-doc-2026.226.0.0.1svn15878-60.4.noarch.rpm"
RPM_HASH = "d4ba5b16f057cba512bfe65a338b2f8d431a7e2b3af82496016fc8622a82430a43248c8ec4263ab1ee5e47e757ac2440e0cdf7d26959ee97d83166652a09caea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-robustcommand-doc-de \
texlive-robustcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
