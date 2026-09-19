SUMMARY = "A thesis class for Beijing Forestry University"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Beijing Forestry University (BJFU) Guidelines \
for Undergraduate Theses and Dissertations. The class should \
meet all current requirements and is updated whenever the \
university guidelines change."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-2026.226.1.2.1svn59809-59.2.noarch.rpm"
RPM_HASH = "94168c966e1e1c6eb628676d21ffd7469d1e5a5cf6ced5aa89e1f77bb77f8d336aa236e83d2efe8bb8644f112aaa84b2c93d180c8dd881c8622ba6f806e80ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bjfuthesis.cls \
texlive-bjfuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-biblatex.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-pdfpages.sty \
tex-silence.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
