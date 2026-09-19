SUMMARY = "Fonts for typesetting in Church Slavonic language"
DESCRIPTION = "The package provides Unicode-encoded OpenType fonts for Church \
Slavonic which are intended for Unicode TeX engines only."
LICENSE = "OFL-1.1"

PV = "2026.226.2.3svn67473"

RPM_NAME = "texlive-fonts-churchslavonic-2026.226.2.3svn67473-60.2.noarch.rpm"
RPM_HASH = "ff11ab4ab9385c7c22cd2aea9702f03be91b14b6b2af82be79b1e3ad86a840e96b0a4fbd2c75a5a34bfc0825a3ddb6e32d9f5008dcac86b03e7b0c16939d3c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fonts-churchslavonic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
