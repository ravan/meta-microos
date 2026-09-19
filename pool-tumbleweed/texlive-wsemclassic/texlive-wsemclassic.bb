SUMMARY = "LaTeX class for Bavarian school w-seminar papers"
DESCRIPTION = "The class is designed either to conform with the \
recommendations of the Bavarian Kultusministerium for \
typesetting w-seminar papers (strict mode), or to use another \
style which should look better. The class is based on the LaTeX \
standard report class."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-2026.226.1.0.1svn31532-59.4.noarch.rpm"
RPM_HASH = "c1010b87f7af5d97c1367ff9b4439bd0f8347699d412c97065ada8cde353c667ee71d1cb49073b23ccf1aeeb137b1a52c2663c3a068b8ad99030268d98eab0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wsemclassic.cls \
texlive-wsemclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-babelbib.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenx.sty \
tex-kvoptions.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-soulutf8.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
