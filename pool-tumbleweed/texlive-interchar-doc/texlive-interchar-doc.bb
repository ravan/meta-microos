SUMMARY = "Documentation for texlive-interchar"
DESCRIPTION = "This package includes the documentation for texlive-interchar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-interchar-doc-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "e6ac2da54568966572da2ddd0579845226e7bc843071b7b5d4146a2d266174448697c2e0ad5f1c200e48f02dc198657da6efde21896138b5d48cfdb3c6218de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interchar-doc"

RDEPENDS:${PN} += ""

inherit rpm
