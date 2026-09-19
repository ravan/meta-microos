SUMMARY = "LaTeX package for TikZ based drawing of military symbols as per NATO APP-6(C)"
DESCRIPTION = "The package offers commands to draw military symbols as per \
NATO APP-6(C) \
https://web.archive.org/web/20150921231042/http://armawiki.zumo \
rc.de/files/NATO/APP-6(C).pdf . It has a set of commands for \
drawing all symbols found in the document up to the control \
measures, as well as support for custom non-standard symbols. \
Control measures are planned to be included in a future \
release."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn78219"

RPM_NAME = "texlive-milsymb-2026.226.1.03svn78219-61.2.noarch.rpm"
RPM_HASH = "1f036164f94b71963e5b4a21ad7311279d1a1f4583c74d1055d9d5e9cdc5dc387c07c2ee2d6d2dd6ae36ac33b81a9192b80f64455c030cd48fd2deffd71ddd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-milsymb.sty \
texlive-milsymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amssymb.sty \
tex-arevmath.sty \
tex-fix-cm.sty \
tex-lmodern.sty \
tex-marvosym.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
