SUMMARY = "Introduction to LaTeX in Polish"
DESCRIPTION = "This is the Polish translation of A Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.4pl1svn63289"

RPM_NAME = "texlive-lshort-polish-2026.226.6.4pl1svn63289-61.2.noarch.rpm"
RPM_HASH = "a3c8f9e1c257776b10841935f9ec596f765d20d1ce1ea23ef48e17124ffb7a54d8cb9b08f59f41464fa178f1f145a7932bd180b0d39be23e10bf550c261ff717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-polish"

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
