SUMMARY = "Support ABC music notation in LaTeX"
DESCRIPTION = "The abc package lets you include lines of music written in the \
ABC Plus language. The package will then employ the \\write18 \
facility to convert your notation to PostScript (using the \
established utility abcm2ps) and hence to the format needed for \
inclusion in your document."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn41157"

RPM_NAME = "texlive-abc-2026.226.2.0bsvn41157-61.2.noarch.rpm"
RPM_HASH = "7b7a5005e65862af9c2eed38a2250f073fafdbabe724ab1fb29ea55c882d81771f9cb18f1cbc31ccac63fd876e027623fd11bab4bd0c7fa30d636e7ee10a3622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abc.sty \
tex-mup.sty \
texlive-abc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-shellesc.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
