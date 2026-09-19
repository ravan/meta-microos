SUMMARY = "Use LaTeX3 to typeset Weiqi (Go)"
DESCRIPTION = "This package uses LaTeX3 to typeset Weiqi (Go). Shi Yong LaTeX3 \
Chuang Jian Yi Ge Pai Ban Wei Qi Qi Pu De Hong Bao ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-weiqi-2026.226.0.0.1svn78101-60.2.noarch.rpm"
RPM_HASH = "bc910efa450c3cb9827eaa1264287ee7fdcb0bde09f778b0ad719a5bf85c1a2efa8cc298d07039d2e6cfd4829d71f647f8c521c4c37efd5c692f0543029ec700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-weiqi.sty \
texlive-weiqi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3draw.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
