SUMMARY = "A deprecated package for LaTeX code documentation"
DESCRIPTION = "This package is no longer supported, fully deprecated. Use (for \
instance) codedescribe or doctools."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77050"

RPM_NAME = "texlive-democodetools-2026.226.1.0.2svn77050-59.2.noarch.rpm"
RPM_HASH = "903344478735f252bec493523f0ee6a0c5acb18bff35db9b232973be4106bc8fce9e017a9d71380c5f14729913f46c28e5d9e28eda9df0eba04e83f75a327657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-democodelisting-1.0.1.sty \
tex-democodelisting.sty \
tex-democodetools-1.0.1.sty \
tex-democodetools.sty \
texlive-democodetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-scontents.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
