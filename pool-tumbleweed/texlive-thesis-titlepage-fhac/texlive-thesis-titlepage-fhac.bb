SUMMARY = "Little style to create a standard titlepage for diploma thesis"
DESCRIPTION = "Yet another thesis titlepage style: support of Fachhochschule \
Aachen (Standort Juelich)"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-2026.227.0.0.1svn15878-62.2.noarch.rpm"
RPM_HASH = "2dc1a65fbdee30115b40ec103e89d7498b5475c1d20ff9757a0d8de0d1c56eeba1c772689407bcb9cf0ffc4f1a2604f495a699f79b30ad3fc0f399376ff1db0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fhACtitlepage.cfg \
tex-fhACtitlepage.sty \
tex-figbib-add.sty \
tex-gloss-add.sty \
texlive-thesis-titlepage-fhac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-figbib.sty \
tex-gloss.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
