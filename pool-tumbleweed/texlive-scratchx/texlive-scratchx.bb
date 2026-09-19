SUMMARY = "Include Scratch programs in LaTeX documents"
DESCRIPTION = "This package can be used to include every kind of Scratch \
program in LaTeX documents. This may be particularly useful for \
Math Teachers and IT specialists. The package depends on the \
following other LaTeX packages: calc, fp, ifsym, multido, tikz, \
xargs, and xstring."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44906"

RPM_NAME = "texlive-scratchx-2026.226.1.1svn44906-60.2.noarch.rpm"
RPM_HASH = "46a082ecc0a04ed8f8cf6900c15f41bea14fa9359a71d9e1bd263c2ca3c46949d84debf5ee5730acf7606947999ed2a9acf31f576ac7b542c042db40c2e19b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ScratchX.sty \
texlive-scratchx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifsym.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-xargs.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
