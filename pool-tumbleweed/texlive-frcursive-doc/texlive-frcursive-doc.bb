SUMMARY = "Documentation for texlive-frcursive"
DESCRIPTION = "This package includes the documentation for texlive-frcursive"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-frcursive-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "1a480cba17203c6d0c23173f4d4d91e11a09e2140a341b2290cd4fb2c0ab4ef0acf2b5418a062c80cb0bb901ab99946463cb41a77e0b6b04e461958cbe4e8bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frcursive-doc"

RDEPENDS:${PN} += ""

inherit rpm
