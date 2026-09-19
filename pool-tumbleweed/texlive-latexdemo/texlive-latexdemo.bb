SUMMARY = "Demonstrate LaTeX code with its resulting output"
DESCRIPTION = "The package provides configurable tools to print out LaTeX code \
and the resulting output in the same document. It also supports \
printing the result inside a conditional sequence; thus one may \
suppress printing if the code would not compile."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn67201"

RPM_NAME = "texlive-latexdemo-2026.226.0.0.2svn67201-61.2.noarch.rpm"
RPM_HASH = "566e45b2a3908762974a430fb11589573e8dc5b16a91fd2d015745be13724c485a323bc1dc4dec3132d5ede095b60f0a245c42655bbacbccaa0a635ced984df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexdemo.sty \
texlive-latexdemo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-framed.sty \
tex-kvoptions-patch.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-pdftexcmds.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
