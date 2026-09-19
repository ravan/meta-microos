SUMMARY = "A package for producing multiple indexes"
DESCRIPTION = "The package enables the user to produce and typeset one or more \
indexes simultaneously with a document. The package is known to \
work in LaTeX documents processed with pdfLaTeX, XeLaTeX and \
LuaLaTeX. If makeindex is used for processing the index \
entries, no particular setting up is needed when TeX Live is \
used. Using xindy or other programs it is necessary to enable \
shell escape; shell escape is also needed if splitindex is \
used."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn77682"

RPM_NAME = "texlive-imakeidx-2026.226.1.3esvn77682-60.2.noarch.rpm"
RPM_HASH = "a8eeb80420f79ae44be48c6ce1e43b2faaeeb7f5732eada8a67e0eb03b56db6a92ee0c6188bd9d70d61f213c324d534f615e406cb8b68a77e5acf1dfeb0fe8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imakeidx.sty \
texlive-imakeidx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-multicol.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
