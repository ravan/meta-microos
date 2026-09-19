SUMMARY = "Slides with headers and footers"
DESCRIPTION = "The class provides a variant of the LaTeX standard slides \
class, in which the user may add headers and footers to the \
slide."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn32293"

RPM_NAME = "texlive-sslides-2026.226.svn32293-64.2.noarch.rpm"
RPM_HASH = "5d3254a35a04d6c3c819b4d14613276137c79ed3c4a7eb1390ca28d3eb6b2f2266d0a02e4c244bdedfc9a7518d9b6de5a5b2843a31458291bc0264fb5317a240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sslides.cls \
texlive-sslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-slides.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
