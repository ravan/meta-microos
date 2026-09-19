SUMMARY = "Subscripts and superscripts with square brackets"
DESCRIPTION = "A LaTeX package to write alternative and customisable \
subscripts and superscripts, with square brackets in the source \
code."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn62738"

RPM_NAME = "texlive-altsubsup-2026.226.1.1svn62738-61.2.noarch.rpm"
RPM_HASH = "0617d73777cc73aecb1b3d45ed26606015131cab0f2cb73574cad6a763177e6fdb717e77f6d7eb131e3f3ad5dd9ab7616320c41a58acbce6bc8fb536c8ca554c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altsubsup.sty \
texlive-altsubsup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-spbmark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
