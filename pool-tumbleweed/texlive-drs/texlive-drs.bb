SUMMARY = "Typeset Discourse Representation Structures (DRS)"
DESCRIPTION = "The package draws Discourse Representation Structures (DRSs). \
It can draw embedded DRSs, if-then conditions and \
quantificational 'duplex conditions' (with a properly scaled \
connecting diamond). Formatting parameters allow the user to \
control the appearance and placement of DRSs, and of DRS \
variables and conditions. The package is based on DRS macros in \
the covington package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn19232"

RPM_NAME = "texlive-drs-2026.226.1.1bsvn19232-59.2.noarch.rpm"
RPM_HASH = "bde300915cfd7dc095cea42a39cf9727cd7dcf8598cfefbe5f57ddab13a4ebab0b318bab59925c7b7a6805a3a281d1a86d5bd9afd0940872cf6573737fdb01bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drs.sty \
texlive-drs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
