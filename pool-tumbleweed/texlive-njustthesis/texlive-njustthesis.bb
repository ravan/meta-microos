SUMMARY = "Thesis template for the Nanjing University of Science and Technology"
DESCRIPTION = "This is a thesis template for the Nanjing University of Science \
and Technology>."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-2026.226.0.0.0.1svn62451-61.2.noarch.rpm"
RPM_HASH = "52a079bd0f1254ab64e31334033d967d384c634dbabf63fbb403a920ef9728cd6e6859d165dfab3cc9c62fa4d3b1bcac1a079ec9b758a51ad73c11271ad0b9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njustthesis.cls \
texlive-njustthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-boxedminipage.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-exercise.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-indentfirst.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-multicol.sty \
tex-newtxmath.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-tabu.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
