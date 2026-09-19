SUMMARY = "Provides convenient key-value options for LaTeX package writers"
DESCRIPTION = "The options package provides easy to use key-value options for \
LaTeX package writers. It has a similar interface as pgfkeys \
with path options but comes with more built-in data types and \
more convenient support for families and searching."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39030"

RPM_NAME = "texlive-options-2026.226.1.0svn39030-61.2.noarch.rpm"
RPM_HASH = "4b1c13b72485ee9fa006247a5a3bdfd8baff25d0d9324a3467b2d0e086ce40215b933ec6f3522c423f4579f173bd779331796dcce05e299dfeafaec1b84c4191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-options.sty \
texlive-options"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
