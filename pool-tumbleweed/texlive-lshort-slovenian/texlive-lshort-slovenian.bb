SUMMARY = "Slovenian translation of lshort"
DESCRIPTION = "A Slovenian translation of the Not So Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.20svn77050"

RPM_NAME = "texlive-lshort-slovenian-2026.226.4.20svn77050-59.2.noarch.rpm"
RPM_HASH = "dcfbb3d94ef4029db3ce26a58f627447429e2d1a4e8a08fda9d21a2657658c6eb9ca35adbbb32e726755de4540e1fa8742402f27734cc2d6c140d2277aa8d750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovenian"

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
