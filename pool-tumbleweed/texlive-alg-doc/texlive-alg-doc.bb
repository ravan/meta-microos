SUMMARY = "Documentation for texlive-alg"
DESCRIPTION = "This package includes the documentation for texlive-alg"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-alg-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "3a626ec8c5d390fbc36d407212ce98584c19e8e2e09ff95d5acc02e7cfb66e6089feb47bd61fafc794ca8bf7ff5b983319e8ae812125456d8d39b3073691fade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alg-doc"

RDEPENDS:${PN} += ""

inherit rpm
