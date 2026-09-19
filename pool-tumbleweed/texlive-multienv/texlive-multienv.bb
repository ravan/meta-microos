SUMMARY = "Multiple environments using a 'key=value' syntax"
DESCRIPTION = "The package provides a multienv environment which permits easy \
addition of multiple environments using a key=value syntax. \
Macros to define environments using this syntax are also \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64967"

RPM_NAME = "texlive-multienv-2026.226.1.0svn64967-61.2.noarch.rpm"
RPM_HASH = "05d86c78b9a24d520c1afbb06147ccd2bdec82ee657ed343f28eb5168e044e09685ddf76d52048eb802201e30dbcd447f1e31412a371ec4d8af272de1bd62c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multienv.sty \
texlive-multienv"

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
