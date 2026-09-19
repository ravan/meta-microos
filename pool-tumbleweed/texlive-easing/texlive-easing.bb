SUMMARY = "Easing functions for pgfmath"
DESCRIPTION = "This library implements a collection of easing functions and \
adds them to the PGF mathematical engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75712"

RPM_NAME = "texlive-easing-2026.226.0.0.1svn75712-61.4.noarch.rpm"
RPM_HASH = "2909a3fd49088064ea9c6fcf655dbdda15c21d41cd431ac07a7c21da69feb2cccba55f9fd3f7a5f13d243b8951152864939f5880332fc3803872842cbb21750f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibraryeasing.code.tex \
texlive-easing"

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
