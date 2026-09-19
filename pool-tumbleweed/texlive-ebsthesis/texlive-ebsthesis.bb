SUMMARY = "Typesetting theses for economics"
DESCRIPTION = "The ebsthesis class and ebstools package facilitate the \
production of camera-ready manuscripts in conformance with the \
guidelines of Gabler Verlag and typographical rules established \
by the European Business School."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-2026.226.1.0svn15878-61.4.noarch.rpm"
RPM_HASH = "8e220001ce8128e8f43652e6c2c2cbd9cb07fb5dc1c028455d70d0d5091a68556560409f86e22c0323c3a65a26692f5a661cba81970e419a65d74012c39fd4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebsthesis.cls \
texlive-ebsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-calc.sty \
tex-caption.sty \
tex-comment.sty \
tex-dsfont.sty \
tex-extbook.cls \
tex-geometry.sty \
tex-ifthen.sty \
tex-mdwlist.sty \
tex-nomencl.sty \
tex-onlyamsmath.sty \
tex-ragged2e.sty \
tex-remreset.sty \
tex-rotfloat.sty \
tex-setspace.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
