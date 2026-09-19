SUMMARY = "A font for typesetting the International Phonetic Alphabet (IPA)"
DESCRIPTION = "This package provides the IPA font Doulos SIL in TrueType \
format."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-2026.226.0.0.1svn63255-59.2.noarch.rpm"
RPM_HASH = "866e364fc23e62c3f5faf31863f56ffc4e1b9a02c7f7f77379103d1b4ce450c381a38143106dbf8f28ae037211d2dd54b2837b5a78b8f09af5689be74265fe3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-doulossil-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
