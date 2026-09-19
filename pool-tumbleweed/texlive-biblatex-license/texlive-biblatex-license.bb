SUMMARY = "Add license data to the bibliography"
DESCRIPTION = "This package is for adding license data to bibliography entries \
via BibLaTeX's built-in related mechanism. It provides a new \
relatedtype license and some bibmacros for typesetting these \
related entries."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-2026.226.0.0.1svn58437-61.2.noarch.rpm"
RPM_HASH = "9913a81a0c2c4510d81833d2890e9d4aef3d46db50b25626184a4ceeac6bd5f19ee05637b947719f460b54cb32b0f0709a7b8aed030c4f51dc347832ee647cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-license.sty \
texlive-biblatex-license"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
