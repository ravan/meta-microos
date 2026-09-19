SUMMARY = "Russian hyphenation"
DESCRIPTION = "A collection of Russian hyphenation patterns supporting a \
number of Cyrillic font encodings, including T2, UCY (Omega \
Unicode Cyrillic), LCY, LWN (OT2), and koi8-r."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn21081"

RPM_NAME = "texlive-ruhyphen-2026.226.1.6svn21081-60.2.noarch.rpm"
RPM_HASH = "b3e1f69525a6f27e1f47a2806af95876e7a0235939d15db1a0216afcfd1cad654f16ed61e79ce56df0540812a6d9f05ec8d9714485b9d5615a1b757c67bfd563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catkoi.tex \
tex-cyryoal.tex \
tex-cyryoas.tex \
tex-cyryoct.tex \
tex-cyryodv.tex \
tex-cyryomg.tex \
tex-cyryovl.tex \
tex-cyryozn.tex \
tex-enrhm2.tex \
tex-hypht2.tex \
tex-koi2koi.tex \
tex-koi2lcy.tex \
tex-koi2ot2.tex \
tex-koi2t2a.tex \
tex-koi2ucy.tex \
tex-ruenhyph.tex \
tex-ruhyphal.tex \
tex-ruhyphas.tex \
tex-ruhyphct.tex \
tex-ruhyphdv.tex \
tex-ruhyphen.tex \
tex-ruhyphmg.tex \
tex-ruhyphvl.tex \
tex-ruhyphzn.tex \
texlive-ruhyphen"

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
