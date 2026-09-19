SUMMARY = "Include .Rnw inside .tex"
DESCRIPTION = "This package is for including .Rnw (knitr/sweave)-files inside \
.tex-files. It requires that you have R and the R-package knitr \
installed. Note: This package will probably not work on \
Windows. It is tested only on OS X, and will probably also work \
on standard Linux distros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-2026.226.0.0.1.0svn47557-60.2.noarch.rpm"
RPM_HASH = "c6c8377bae3a2b9e5b5c3a1c1d0b1a320390967b48d758fad39b740798f0fb6377e66e4ec84c5783c7fecb09acea2ae6a390571b98bb7c0b65de583212e03c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-includeRnw.sty \
texlive-includernw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
