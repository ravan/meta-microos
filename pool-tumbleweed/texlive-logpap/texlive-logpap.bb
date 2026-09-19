SUMMARY = "Generate logarithmic graph paper with LaTeX"
DESCRIPTION = "The logpap package provides four macros for drawing \
logarithmic-logarithmic, logarithmic-linear, linear-logarithmic \
and (because it was easy to implement) linear-linear graph \
paper with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-logpap-2026.226.0.0.6svn15878-61.2.noarch.rpm"
RPM_HASH = "132c9e527bdf6ac492ae549d5a0847dc7b7f810ca868dffe64ec99a4ecbd381d2ffc0310a0e671697c5c502e2005cc9b8846437958f030ab7824f4e15e618322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logpap.sty \
texlive-logpap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
