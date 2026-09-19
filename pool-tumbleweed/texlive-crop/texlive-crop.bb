SUMMARY = "Support for cropmarks"
DESCRIPTION = "A package providing corner marks for camera alignment as well \
as for trimming paper stacks, and additional page information \
on every page if required. Most macros are easily adaptable to \
personal preferences. An option is provided for selectively \
suppressing graphics or text, which may be useful for printing \
just colour graphics on a colour laser printer and the rest on \
a cheap mono laser printer. A page info line contains the time \
and a new cropmarks index and is printed at the top of the \
page. A configuration command is provided for the info line \
font. Options for better collaboration with dvips, pdfTeX and \
vtex are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10.2svn77682"

RPM_NAME = "texlive-crop-2026.226.1.10.2svn77682-61.2.noarch.rpm"
RPM_HASH = "953b1bd9693e11e34cc5fa6588f8f874e084a1f35ee236fa8233be36a12312e0a2a307beea558c3fffb689438e479b638d3ebcf159265eafee022e1c52c3b48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crop.sty \
texlive-crop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
