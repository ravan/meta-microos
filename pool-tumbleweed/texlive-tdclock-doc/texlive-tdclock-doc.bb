SUMMARY = "Documentation for texlive-tdclock"
DESCRIPTION = "This package includes the documentation for texlive-tdclock"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.2.5svn33043"

RPM_NAME = "texlive-tdclock-doc-2026.227.2.5svn33043-62.2.noarch.rpm"
RPM_HASH = "02eb8d0e7e36020f307a42353249224e3195b2bb41a9b23409912d20ee97f7098ff09f5eee2bc3ed8917cb5b4c817fc9e6c297ab37af2eea2446de672434dc3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tdclock-doc"

RDEPENDS:${PN} += ""

inherit rpm
