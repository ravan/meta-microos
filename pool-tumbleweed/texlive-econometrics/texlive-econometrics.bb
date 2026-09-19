SUMMARY = "Defines some commands that simplify mathematic notation in economic and econometric writing"
DESCRIPTION = "Econometrics is a package that defines some commands that \
simplify mathematic notation in economic and econometrics \
writing. The commands are related to the notation of vectors, \
matrices, sets, calligraphic and roman letters statistical \
distributions constants and symbols matrix operators and \
statistical operators. The package is based on 'Notation in \
Econometrics: a proposal for a standard' by Karim Abadir and \
Jan R. Magnus, The Econometrics Journal (2002), 5, 76-90."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39396"

RPM_NAME = "texlive-econometrics-2026.226.1.0svn39396-61.4.noarch.rpm"
RPM_HASH = "9622f3b0d5fd87c7b6577a173b31b63146ba1b5493431ebc6d1b8251924876b2b8fef799603ed44f2313f26003e955bef580738c7a736853e78da6288b6d47d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econometrics.sty \
texlive-econometrics"

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
