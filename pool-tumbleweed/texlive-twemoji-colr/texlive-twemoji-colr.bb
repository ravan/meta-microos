SUMMARY = "Twemoji font in COLR/CPAL layered format"
DESCRIPTION = "This is a COLR/CPAL-based color OpenType font from the Twemoji \
collection of emoji images."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn75301"

RPM_NAME = "texlive-twemoji-colr-2026.226.0.0.7.0svn75301-59.2.noarch.rpm"
RPM_HASH = "6bc23e81fcd60d93faccfa5ea7724182a1e582bee7bdd77e218ebfa70878567cfcbfe6ca010a7560c7dcd670e73739f91e4c55a2fd902d31c75baf231f73ded4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr"

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
texlive-scripts-bin \
texlive-twemoji-colr-fonts"

inherit rpm
