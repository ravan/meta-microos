SUMMARY = "Many-featured Young tableaux and Young diagrams"
DESCRIPTION = "The package provides several functions for drawing Young \
tableaux and Young diagrams, extending the young and youngtab \
packages but providing lots more features. Skew and coloured \
tableaux are easy, and pgfkeys-enabled options are provided \
both at package load and configurably."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-ytableau-2026.226.1.4svn77682-59.4.noarch.rpm"
RPM_HASH = "7202e8b92ad127ae3d69861a63fd78842c8db2821589fc67b07551be2904b2eed574434a4c652c60a8f9980f4ca7d21b72fe41531156b4dfeeba33daeb821918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ytableau.sty \
texlive-ytableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
