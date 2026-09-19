SUMMARY = "Exam class for Hefei University of Technology (China)"
DESCRIPTION = "This package provides an exam class for Hefei University of \
Technology (China). Gai Wen Dang Lei Ti Gong Liao He Fei Gong \
Ye Da Xue Kao Shi Shi Juan Mo Ban , Dian Ji Xia Fang Download \
Lai Xia Zai Suo You Wen Jian ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn75068"

RPM_NAME = "texlive-hfutexam-2026.226.1.10svn75068-60.4.noarch.rpm"
RPM_HASH = "9dc68f43a27aaff31b9af55dae1a469e0f673e0aeb05bbdd5eeac3f7ff9bfd169f88f2e6d390a43becb1e9b836551a624932da11dc8a148b2ccbacc70080244f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfutexam.cls \
texlive-hfutexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-ctexart.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
