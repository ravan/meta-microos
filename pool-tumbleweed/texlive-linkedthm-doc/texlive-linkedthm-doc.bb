SUMMARY = "Documentation for texlive-linkedthm"
DESCRIPTION = "This package includes the documentation for texlive-linkedthm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75860"

RPM_NAME = "texlive-linkedthm-doc-2026.226.1.0svn75860-61.2.noarch.rpm"
RPM_HASH = "5936aaa6891f1f66a6cfe5ffae8fcc9a92c1fc5dea93ab1d68956111adc24b4dbd2a6ef1bad9e8d050983d8189f2b6ca422f69a538739fe560992c09e34e350a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linkedthm-doc"

RDEPENDS:${PN} += ""

inherit rpm
