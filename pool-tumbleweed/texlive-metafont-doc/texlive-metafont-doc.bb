SUMMARY = "Documentation for texlive-metafont"
DESCRIPTION = "This package includes the documentation for texlive-metafont"
LICENSE = "SUSE-TeX"

PV = "2026.226.2.71828182svn77830"

RPM_NAME = "texlive-metafont-doc-2026.226.2.71828182svn77830-61.2.noarch.rpm"
RPM_HASH = "c905b49194ae3735261286d7db9582748405c1ebc74e0b3d1b49896392b05a3176bc952c63de1065bb46b4ec90aa3fbebf539676116f61c54af2fceba9552c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-inimf.1 \
man-mf-nowin.1 \
man-mf.1 \
texlive-metafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
