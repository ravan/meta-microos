SUMMARY = "Allows font sizes up to 35.83pt"
DESCRIPTION = "A package for using font sizes up to 35.88pt, for example with \
the EC fonts. New commands \\HUGE and \\ssmall for selecting font \
sizes are provided together with some options working around \
current LaTeX2e shortcomings in using big font sizes. The \
package also provides options for improving the typesetting of \
paragraphs (or headlines) with embedded math expressions at \
font sizes above 17.28pt."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn78101"

RPM_NAME = "texlive-moresize-2026.226.1.9svn78101-61.2.noarch.rpm"
RPM_HASH = "ee29ab4a32ee40c2b1897e38e71bd31e4e0bac8b21b1a5c40aea97d744d5a3bff2d6bee95ab3e0c9c6f749c49724df1fe2625618ad4864d3f9d08672090a5ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moresize.sty \
texlive-moresize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
