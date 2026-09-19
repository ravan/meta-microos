SUMMARY = "Tools for writing teaching material"
DESCRIPTION = "This package provides macros and environments useful for \
writing teaching material. It provides more semantic \
environments on top of the standard definition, theorem, and \
friends: for instance, exercise, activity and question. These \
are suitably colour-coded when used with Beamer. They occur as \
'normal' text in handouts produced by beamerarticle (same style \
as definition usually has). It also provides macros for \
typesetting code listings and output side by side. Finally, it \
modifies the appearance of beamer (Berlin-based theme) and \
memoir (Tufte style layout), if loaded. It is designed to be \
used with beamer to produce slides and beamerarticle with \
memoir to produce notes and handouts from the same source."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn70901"

RPM_NAME = "texlive-didactic-2026.226.1.7svn70901-59.2.noarch.rpm"
RPM_HASH = "6446f3f4ecb1b6467263384acef8f502a7c3d1b92af1d86842c36b0c840f06595765ed41b7dbe08e305f3477c040c954f2f61228f892e6b8d333276d7451a619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-didactic.sty \
texlive-didactic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-babel.sty \
tex-beramono.sty \
tex-changepage.sty \
tex-etoolbox.sty \
tex-helvet.sty \
tex-marginfix.sty \
tex-mathpazo.sty \
tex-minted.sty \
tex-pythontex.sty \
tex-ragged2e.sty \
tex-tabularx.sty \
tex-thmtools.sty \
tex-translations.sty \
tex-unique.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
