SUMMARY = "Producing multiple indices"
DESCRIPTION = "This package enables the user to produce and typeset one or \
more indices simultaneously. The package is known to work in \
LaTeX documents processed with pdfLaTeX, XeLaTeX and LuaLaTeX. \
If makeindex is used for processing the index entries, no \
particular setup is needed when TeX Live is used. Using xindy \
or other programs, it is necessary to enable shell escape. \
Shell escape is also needed if splitindex is used. This is a \
fork of imakeidx, with new features and fixed bugs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.0svn68555"

RPM_NAME = "texlive-indextools-2026.226.1.7.0svn68555-60.2.noarch.rpm"
RPM_HASH = "3e556ac7cd247d4cd15dfa8fdcae33f1538e901e85268c33ddbc5da1631ac61de35395ead9fbdea04784c14f21829ead3e9e7b7cfd555a7f4d736501a8438e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-indextools.sty \
texlive-indextools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-letltxmacro.sty \
tex-multicol.sty \
tex-pdftexcmds.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
