SUMMARY = "Highlighted source code for LaTeX"
DESCRIPTION = "The package that facilitates expressive syntax highlighting in \
LaTeX using the powerful Pygments library. The package also \
provides options to customize the highlighted source code \
output using fancyvrb."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.7.0svn77682"

RPM_NAME = "texlive-minted-2026.226.3.7.0svn77682-61.2.noarch.rpm"
RPM_HASH = "c1c6646fc7171c8786093ee56109bfa184ad9213ea910c271e05fa795cbbb5251e555e473848f375b4d15b7504f21f598e991cdd9c01f604816ee015cafb43e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minted.sty \
tex-minted1.sty \
tex-minted2.sty \
texlive-minted"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-framed.sty \
tex-fvextra.sty \
tex-ifplatform.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-latex2pydata.sty \
tex-lineno.sty \
tex-newfloat.sty \
tex-pdftexcmds.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-shellesc.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-catchfile \
texlive-etoolbox \
texlive-filesystem \
texlive-float \
texlive-fvextra \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2pydata \
texlive-minted-bin \
texlive-newfloat \
texlive-pdftexcmds \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xcolor"

inherit rpm
