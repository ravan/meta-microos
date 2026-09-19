SUMMARY = "A class for documents of the ASOIU department at Omsk State Technical University"
DESCRIPTION = "This package provides a class for documents which are prepared \
on the 'Automatic systems for information processing and \
control' (ASOIU) of Omsk State Technical University, Omsk, \
Russia. The class is based on the article class and requires \
XeLaTeX or LuaLaTeX for its proper working. Formatting complies \
with the instructions issued on January 29, 2024 and at GOST \
7.32-2017."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn74183"

RPM_NAME = "texlive-omgtudoc-asoiu-2026.226.1.1bsvn74183-61.2.noarch.rpm"
RPM_HASH = "6a1045dab7c57016f5238ca02c43a940897d694cdace21c45d3a209b1562dd741eb2f724259f4ce10b2e1480a2bc331b007cfaeb6faa54c2ee93d8de50cb1368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-omgtudoc-asoiu-gost-numeric.bbx \
tex-omgtudoc-asoiu.cls \
texlive-omgtudoc-asoiu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-assoccnt.sty \
tex-caption.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-gost-standard.bbx \
tex-newtxmath.sty \
tex-polyglossia.sty \
tex-tempora.sty \
tex-totcount.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
