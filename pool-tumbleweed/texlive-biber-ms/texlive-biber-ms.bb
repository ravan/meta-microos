SUMMARY = "A BibTeX replacement for users of BibLaTeX (multiscript version)"
DESCRIPTION = "This is the multiscript version of biber (biber-ms) and must be \
used with the multiscript version of biblatex-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2026.226.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-2026.226.4.0_1svn66478-61.2.noarch.rpm"
RPM_HASH = "cf8a6712921574601bcb0b7d439b1a9bd417dec300b11748f6b3b455a1f44b476550b4e4ec103fe8d7dea829d21a918e5d812c976625b04360b542490ef91289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-biber-ms-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
