SUMMARY = "Documentation for texlive-pgf-pie"
DESCRIPTION = "This package includes the documentation for texlive-pgf-pie"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-doc-2026.226.0.0.7svn63603-58.2.noarch.rpm"
RPM_HASH = "c773ec5537e45f43512ef3c489ade86c0444ab1cf702cc0bb26b5c46391231ff21fc0a6eb75447755588be979943b7f7bcf2f8ec168390003d5d64722701f409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-pie-doc"

RDEPENDS:${PN} += ""

inherit rpm
