SUMMARY = "Pgfornament library for Chinese traditional motifs and patterns"
DESCRIPTION = "This package provides a pgfornament library for Chinese \
traditional motifs and patterns. The command \\pgfornamenthan \
takes the same options as \\pgfornament from the pgfornament \
package, but renders Chinese traditional motifs instead. The \
list of supported motifs, as well as some examples, can be \
found in the accompanying documentation. This bundle also \
provides three beamer themes incorporating these motifs; sample \
.tex files for creating beamer presentations and posters are \
included. Yi pgfornament Hong Bao De Ji Zhi ,Shi Xian Hui Zhi \
Yi Feng Tu Wen . \\pgfornamenthan He \\pgfornament De Can Shu Shi \
Yi Yang De ; Bian Yi De Chu Lai De Dang Ran Shi Yi Feng Wen \
Yang Liao . Hong Bao Shou Ce Li You Wan Zheng De Wen Yang Lie \
Biao Yi Ji Shi Yong Fan Li . Wo Men Ye Ji Yu Zhe Xie Wen Yang \
,Kai Fa Liao San Kuan beamerZhu Ti , Bing Fu Shang Zhi Zuo \
beamerHuan Deng Pian He Hai Bao De Shi Fan .texWen Dang ."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72640"

RPM_NAME = "texlive-pgfornament-han-2026.226.svn72640-58.2.noarch.rpm"
RPM_HASH = "ff82be07289281e7b615ace1c2be56368e392175b5eaf747ebc98e911ba0f6fda6f6610550aa128bf890ec51fd1e10a46b2e05c1e5c7cbacc32823d30a8cb748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeHeavenlyClouds.sty \
tex-beamerthemeTianQing.sty \
tex-beamerthemeXiaoshan.sty \
tex-cncolours.sty \
tex-pgflibraryhan.code.tex \
tex-pgfornament-han.sty \
texlive-pgfornament-han"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-needspace.sty \
tex-pgfmath.sty \
tex-pgfornament.sty \
tex-relsize.sty \
tex-suffix.sty \
tex-tcolorbox.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
