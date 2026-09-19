SUMMARY = "Cut a window in a paragraph, typeset material in it"
DESCRIPTION = "The package provides facilities to cut windows out of \
paragraphs, and to typeset text or other material in the \
window. The window may be rectangular, or may have other sorts \
of shape."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-cutwin-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "7b5a70ebc1e54e5774e103666cce5469970af8d57a237a99e71e882feb16b158b6818b1fd5167e4c72a3f5eb2bf009779fb9ce7979fb67b6db548d9539890678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cutwin.sty \
texlive-cutwin"

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
