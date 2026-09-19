SUMMARY = "Insert non-breakable spaces using XeTeX"
DESCRIPTION = "The package will directly insert nonbreakable spaces (in Czech, \
vlna or vlnka), after nonsyllabic prepositions and single \
letter conjunctions, while the document is being typeset. (The \
macros recognised maths and verbatim by TeX means.) (Inserting \
nonbreakable spaces by a preprocessor will probably never be \
fully reliable, because user defined macros and environments \
cannot reliably be recognised.) The package works both with \
(Plain) XeTeX and with XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-xevlna-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "b0b4765e9217f2f02b0fd2b60422c9c9d00696cd424067699415cae53d4964ce1cdbbf4754e9ecdbe3103fcea98cf33bb3fab0024a134efbc35f63f75f08568a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xevlna.sty \
texlive-xevlna"

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
