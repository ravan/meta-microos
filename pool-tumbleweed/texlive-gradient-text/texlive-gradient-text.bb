SUMMARY = "Decorate text with linear gradient colors"
DESCRIPTION = "This package enables writers to conveniently decorate text with \
linear gradient colors. The RGB values of the first and the \
last character are specified as parameters while the rest of \
the text is colored automatically."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-gradient-text-2026.226.1.2svn76924-60.4.noarch.rpm"
RPM_HASH = "3cf8db0a58995953fcbb7acd43d8066671193af9c1c1bd8408191a9a4e025e4b5eb5c578a729aed0c3dfd4e3c6e505c723eb845032326c5f374b584e7a44ab67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradient-text.sty \
texlive-gradient-text"

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
