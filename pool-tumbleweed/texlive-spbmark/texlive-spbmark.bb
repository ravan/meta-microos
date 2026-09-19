SUMMARY = "Customize superscripts and subscripts"
DESCRIPTION = "This package provides three commands \\super, \\sub and \\supersub \
to improve the layout of superscripts and subscripts which can \
be adjusted with respect to relative position and format, and \
can be used in text and math mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.46ysvn76924"

RPM_NAME = "texlive-spbmark-2026.226.1.46ysvn76924-64.2.noarch.rpm"
RPM_HASH = "729f846e65a7312267a4a71782cb6e277a9c04801db0018c61ae3f90eb8230dfcab94c3ac08963501b5e09ea234a032cfdafdb1fb9f15a8658a3fcc16a1abfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spbmark.sty \
texlive-spbmark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
