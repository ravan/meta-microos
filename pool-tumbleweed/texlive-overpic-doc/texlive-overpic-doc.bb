SUMMARY = "Documentation for texlive-overpic"
DESCRIPTION = "This package includes the documentation for texlive-overpic"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-overpic-doc-2026.226.2.2svn77682-58.2.noarch.rpm"
RPM_HASH = "17cf2e04ff9c805dfcfd324ba4ad88bafa60ee7979e64ae924e641b33356467e95e12a894934e78b9bd1f58ca9d6fa59a35d0a0d1e423fdb1dbf367941e2d145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-overpic-doc-de;en \
texlive-overpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
