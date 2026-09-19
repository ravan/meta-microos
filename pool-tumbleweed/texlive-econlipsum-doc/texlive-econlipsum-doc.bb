SUMMARY = "Documentation for texlive-econlipsum"
DESCRIPTION = "This package includes the documentation for texlive-econlipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.2svn77682"

RPM_NAME = "texlive-econlipsum-doc-2026.226.0.0.8.2svn77682-61.4.noarch.rpm"
RPM_HASH = "43b626787f1b7cda21454906d6876f02f455a9cdac2026cabceac78cc499da1ab4a2e374960712f8c7c6d910acc7d0e202657a5c2df38f63a049262a59b8ae80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
