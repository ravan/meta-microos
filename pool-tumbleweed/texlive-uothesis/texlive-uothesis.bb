SUMMARY = "Class for dissertations and theses at the University of Oregon"
DESCRIPTION = "The class generates documents that are suitable for submission \
to the Graduate School and conform with the style requirements \
for dissertations and theses as laid out in the Fall 2010 UO \
graduate school student manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-2026.226.2.5.6svn25355-60.2.noarch.rpm"
RPM_HASH = "7758bca128cca7c85822b2425b3b69bde572892bd70da4b7dec882e2116af7893498237beb8e270d389cf3a3764fa14b5e4821c8520e1d79cff384503c8c0b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uothesis.cls \
texlive-uothesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-draftwatermark.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-layouts.sty \
tex-lineno.sty \
tex-lipsum.sty \
tex-mhchem.sty \
tex-natbib.sty \
tex-ragged2e.sty \
tex-report.cls \
tex-setspace.sty \
tex-subfig.sty \
tex-todonotes.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
