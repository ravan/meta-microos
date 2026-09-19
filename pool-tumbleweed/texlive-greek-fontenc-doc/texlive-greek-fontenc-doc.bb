SUMMARY = "Documentation for texlive-greek-fontenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-fontenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-greek-fontenc-doc-2026.226.2.6svn77682-60.4.noarch.rpm"
RPM_HASH = "babe612ee751491b7b962dd68bdb0405b513b62a4c56c64d6f9ed7b0dc3be8a744ebe7652154dfdfb362735df2ba845921da9f4f2e872ac2e639a145981d8620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-fontenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
