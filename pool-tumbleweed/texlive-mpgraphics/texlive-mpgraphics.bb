SUMMARY = "Process and display MetaPost figures inline"
DESCRIPTION = "The package allows LaTeX users to typeset MetaPost code inline \
and display figures in their documents with only and only one \
run of LaTeX, pdfLaTeX or XeLaTeX (no separate runs of mpost). \
Mpgraphics achieves this by using the shell escape (\\write 18) \
feature of current TeX distributions, so that the whole process \
is automatic and the end user is saved the tiresome processing."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-2026.226.0.0.3svn29776-61.2.noarch.rpm"
RPM_HASH = "f5b2d15d3f269bc1745b8e1cdf03a2869b343631ad6dea4a7af1904e2fbcc88414f55962e994aed9132c99a482b753c4386cc08e7480079f09845234724e7e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpgraphics.sty \
texlive-mpgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.cfg \
tex-color.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-moreverb.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
